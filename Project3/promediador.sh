# !/ bin / bash
suma=0
mes=0
cont=0
for i in $(cat PanguilemoTemperatura2010.csv) ;
do
mes=$mes+1
suma=$suma + $(cat PanguilemoTemperatura2010.csv |grep "2010-$mes" | cut -f 2 -d ";")
cont=$cont+1
prom=$( $suma / $cont)
echo $prom
echo $suma >> Temperatura.txt
done
		
