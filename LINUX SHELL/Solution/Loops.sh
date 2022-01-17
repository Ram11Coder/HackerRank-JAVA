for (( i=1;i<=99;i++ ))
do
if test `expr $i % 2` -eq 1
then
echo $i
fi
done
