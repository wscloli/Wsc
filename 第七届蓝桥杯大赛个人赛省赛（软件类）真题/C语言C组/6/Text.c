#include <stdio.h>
int main(){
    int a,b,c,d,e,f,g,h,i;
    int arr[9]={a,b,c,d,e,f,g,h,i};
for(arr[0]=1;arr[0]<=9;arr[0]++){
    for(arr[1]=1;arr[1]<=9;arr[1]++){
        for(arr[2]=1;arr[2]<=9;arr[2]++){
            for(arr[3]=1;arr[3]<=9;arr[3]++){
                for(arr[4]=1;arr[4]<=9;arr[4]++){
                    for(arr[5]=1;arr[5]<=9;arr[5]++){
                        for(arr[6]=1;arr[6]<=9;arr[6]++){
                            for(arr[7]=1;arr[7]<=9;arr[7]++){
                                for(arr[8]=1;arr[8]<=9;arr[8]++){
if(arr[0]+arr[1]/arr[2]+(arr[3]*arr[4]*arr[5])/(arr[6]*arr[7]*arr[8])==10){

    printf("%d%d%d%d%d%d%d%d%d\n",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
                                        }
                                    }
                                }
                            }
                        }               
                    }
                }  
            }
        }
    }   
}