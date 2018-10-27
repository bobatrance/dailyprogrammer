def dp98e(op, n):
    n = int(n)
    table = [[0]*(n+1) for i in range(n+1)]
    div = ''
    run = [i for i in range(n+1)]
    for i in range(n+1):
        div += '----'
        for j in range(n+1):
             table[i][j] = eval('%d%s%d'%(i, op, j))
    print op,'|', str(run).strip('[]').replace(',',' ')
    print div
    for i in run:
        print run[i], '|', str(table[i]).strip(',[]').replace(',', ' ')
dp98e('*',4)