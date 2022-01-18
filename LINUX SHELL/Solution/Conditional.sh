read ch
# comparing two strings use = operator
if [[ $ch = "y" || $ch = "Y" ]];
then
echo "YES"
elif [[ $ch = "n" || $ch = "N" ]];
then 
echo "NO"
fi
