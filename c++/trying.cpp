#include <iostream>
#include<vector>
using namespace std;
#define ll  long long int
#define vi  vector<int>
#define vll vector<long long int>

void Prints(int ind,vector<int> &ds,int s,int sum,int a[],int n){
    if(ind==n){
        
            for(auto it:ds) 
            {
                cout<<it<<" ";
                
            }cout<<endl;
    }return;

ds.push_back(a[ind]);
Prints(ind+1,ds,s,sum,a,n);
ds.pop_back();
Prints(ind+1,ds,s,sum,a,n);
}

int main(){
     int a[3]={3,1,2};
     vector<int> ds;
    Prints(0,ds,0,2,a,3);
    return 0;
}