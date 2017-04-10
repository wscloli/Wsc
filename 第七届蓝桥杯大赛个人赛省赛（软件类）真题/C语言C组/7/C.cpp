#include <iostream>
#include <algorithm>
using namespace std;
int main(int argc,char* argv[]){
    int a[]={1,3,4,5,6,7};
    do{
        cout<<a[1]<<a[2]<<a[3]<<endl;
    }while(next_permutation(a,a+5));
    return 0;
}