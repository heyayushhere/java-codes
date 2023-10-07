#include<iostream>
#include <vector>
using namespace std;
#define ll  long long int
#define vi  vector<int>
#define vll vector<long long int>
void Printf(int ind,vector<int> &ds,int arr[],int n){
    if(ind==n){
    for(auto it:ds){
        cout<<it<<" ";
    }
    if(ds.size()==0){
        cout<<"{}"<<endl;
    }
    cout<<endl;
    return;}
    ds.push_back(arr[ind]);
    Printf(ind+1,ds,arr,n);
    ds.pop_back();
    Printf(ind+1,ds,arr,n);

}
int main(){
     int arr[]={3,1,2};
     int n=3;
     vector<int> ds;
     Printf(0,ds,arr,n);
     return 0;
}