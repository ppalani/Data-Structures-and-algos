def f_insertion_sort(a):
    for i in range(1,len(a)):
        key=a[i];
        j=i-1;
        while j>=0 and a[j]>key:
            a[j+1]=a[j];
            j=j-1;
        a[j+1]=key;
    return a;
        


d = [3, 5, 7, 8, 2, 3];
print('unsorted',d);
print('sorted  ',f_insertion_sort(d));
