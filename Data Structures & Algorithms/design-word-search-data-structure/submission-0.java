

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean end;

    TrieNode() {
        Arrays.fill(children, null);
        end = false;
    }
}

class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = node.children[ch - 'a'];
        }

        node.end = true;
    }

    public boolean search(String word) {
        return dfs(root, word, 0);
    }

    private boolean dfs(TrieNode node, String word, int index) {
        if (index == word.length()) {
            return node.end;
        }

        char ch = word.charAt(index);

        if (ch != '.') {
            if (node.children[ch - 'a'] == null) {
                return false;
            }

            return dfs(node.children[ch - 'a'], word, index + 1);
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                if (dfs(node.children[i], word, index + 1)) {
                    return true;
                }
            }
        }

        return false;
    }
}
