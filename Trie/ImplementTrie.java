class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}
class Trie {
    TrieNode root;

    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current=root;
        for(char ch:word.toCharArray()){
            int index= ch - 'a';
            if(current.children[index]==null){
                current.children[index]=new Trie();
            }
            current=current.children[index];
        }
        current.isEndOfWord=true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index]==null){
                return false;
            }
            current=current.children[index];
        }
        return current.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current= root;
        for(char ch:word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index]==null){
                return false;
            }
            current=current.children[index];
        }
        return true;
    }
}

