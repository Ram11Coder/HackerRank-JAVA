read exp

#printf "%.3f" $(bc -l <<< "$exp")
#printf "%.3f\n" $(echo "$exp" | bc -l)

printf "%.3f" $(echo "$exp" |bc -l)
