#include <stdio.h>
#include <string.h>
//串逐位和

//给定一个由数字组成的字符串，我们希望得到它的各个数位的和。
//比如：“368” 的诸位和是：17
    int f(char s[],int begin,int end){
        int mid;
        if(end-begin==1)return s[begin]-'0';
        mid=(end+begin)/2;
        return f(s,begin,mid)+f(s,mid,end);//f(0,2)   f(2,4)
    //  
    }
    int main(){
        char s[]="472";
        printf("%d\n",f(s,0,strlen(s)));
        return 0;
    }
