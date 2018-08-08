desc1=$(cat lista.txt | grep "2010-2011"| tr -d '\r')
wget https://srvbioinf1.utalca.cl/~fduran/data/$desc1
desc2=$(cat lista.txt | grep "2011-2012"| tr -d '\r')
wget https://srvbioinf1.utalca.cl/~fduran/data/$desc2
desc3=$(cat lista.txt | grep "2012-2013"| tr -d '\r')
wget https://srvbioinf1.utalca.cl/~fduran/data/$desc3
desc4=$(cat lista.txt | grep "2013-2014"| tr -d '\r')
wget https://srvbioinf1.utalca.cl/~fduran/data/$desc4
desc5=$(cat lista.txt | grep "2014-2015a"| tr -d '\r')
wget https://srvbioinf1.utalca.cl/~fduran/data/$desc5
desc6=$(cat lista.txt | grep "2014-2015b"| tr -d '\r')
wget https://srvbioinf1.utalca.cl/~fduran/data/$desc6
