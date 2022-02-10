#https://www.hackerrank.com/challenges/the-minion-game/submissions/code/148711082
def minion_game(s):
    n=len(s)
    stuart = 0
    kevin = 0
    for i in range(n):
        if s[i] in ('A', 'E', 'I', 'O', 'U'):
            kevin += n - i
        else:
            stuart += n - i

    if kevin > stuart:
        print ('Kevin',kevin)
    elif stuart > kevin:
        print ('Stuart',stuart) 
    else:
        print ('Draw')

