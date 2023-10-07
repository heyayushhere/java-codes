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