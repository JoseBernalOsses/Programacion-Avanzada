#2010
cat Panguilemodetalle2010-2011.csv |grep "2010" |cut -f 1,7 -d ";" > PanguilemoTemperatura2010.csv

cat Panguilemodetalle2010-2011.csv |grep "2010" |cut -f 1,6 -d ";" > PanguilemoHumedad2010.csv
#2011
cat Panguilemodetalle2010-2011.csv |grep "2011" |cut -f 1,7 -d ";" > PanguilemoTemperatura2011.csv
cat Panguilemodetalle2011-2012.csv |grep "2011" |cut -f 1,7 -d ";" >>PanguilemoTemperatura2011.csv

cat Panguilemodetalle2010-2011.csv |grep "2011" |cut -f 1,6 -d ";" > PanguilemoHumedad2011.csv
cat Panguilemodetalle2011-2012.csv |grep "2011" |cut -f 1,6 -d ";" >>PanguilemoHumedad2011.csv
#2012
cat Panguilemodetalle2011-2012.csv |grep "2012" |cut -f 1,7 -d ";" > PanguilemoTemperatura2012.csv
cat Panguilemodetalle2012-2013.csv |grep "2012" |cut -f 1,7 -d ";" >>PanguilemoTemperatura2012.csv

cat Panguilemodetalle2011-2012.csv |grep "2012" |cut -f 1,6 -d ";" > PanguilemoHumedad2012.csv
cat Panguilemodetalle2012-2013.csv |grep "2012" |cut -f 1,6 -d ";" >>PanguilemoHumedad2012.csv
#2013
cat Panguilemodetalle2012-2013.csv |grep "2013" |cut -f 1,7 -d ";" > PanguilemoTemperatura2013.csv
cat Panguilemodetalle2013-2014.csv |grep "2013" |cut -f 1,7 -d ";" >>PanguilemoTemperatura2013.csv

cat Panguilemodetalle2012-2013.csv |grep "2013" |cut -f 1,6 -d ";" > PanguilemoHumedad2013.csv
cat Panguilemodetalle2013-2014.csv |grep "2013" |cut -f 1,6 -d ";" >>PanguilemoHumedad2013.csv
#2014
cat Panguilemodetalle2013-2014.csv |grep "2014" |cut -f 1,7 -d ";" > PanguilemoTemperatura2014.csv
cat Panguilemodetalle2014-2015a.csv |grep "2014" |cut -f 1,7 -d ";" >>PanguilemoTemperatura2014.csv

cat Panguilemodetalle2013-2014.csv |grep "2014" |cut -f 1,6 -d ";" > PanguilemoHumedad2014.csv
cat Panguilemodetalle2014-2015a.csv |grep "2014" |cut -f 1,6 -d ";" >>PanguilemoHumedad2014.csv
#2015
cat Panguilemodetalle2014-2015a.csv |grep "2015" |cut -f 1,7 -d ";" > PanguilemoTemperatura2015.csv
cat Panguilemodetalle2014-2015b.csv |grep "2015" |cut -f 1,7 -d ";" >>PanguilemoTemperatura2015.csv

cat Panguilemodetalle2014-2015a.csv |grep "2015" |cut -f 1,6 -d ";" > PanguilemoHumedad2015.csv
cat Panguilemodetalle2014-2015b.csv |grep "2015" |cut -f 1,6 -d ";" >>PanguilemoHumedad2015.csv

