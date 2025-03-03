class Solution {
    public String simplifyPath(String path) {
        String[] paths=path.split("/");
        int pos=0;
        for(String pat:paths){
            if(pat.equals("..")){
                if(pos>0){
                    pos--;
                }
            }
            else if(!pat.equals("")&&!pat.equals(".")){
               paths[pos++]=pat; 
            }
             
            
        }
        return "/"+String.join("/",Arrays.copyOfRange(paths,0,pos));
    }
}