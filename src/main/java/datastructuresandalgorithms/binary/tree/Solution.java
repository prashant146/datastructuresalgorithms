package datastructuresandalgorithms.binary.tree;

import java.util.*;

public class Solution {

        private Node root;

        public static void main(String[] args) {
            Solution solution = new Solution();
            solution.insert(1);
            solution.insert(2);
            solution.insert(3);
            solution.insert(4);
            solution.insert(5);
            solution.insert(6);
            solution.insert(7);
            //solution.diameter(solution.root);
            //System.out.println("max width :"+solution.getMaxWidthOfTree(solution.root));
            //solution.printRootToLeafPaths();
            //solution.printAllAncesstorsOfBinaryTree(solution.root, 0);
            //System.out.println(solution.findLCA(solution.root, 2, 6).getData());
            solution.verticalOrderTraversal();

        }

        public void printTopView(){

            Queue<QNode> queue = new LinkedList<>();
            queue.add(new QNode(0, root));

            Set<Integer> set = new HashSet<>();
            while(!queue.isEmpty()){
                QNode temp = queue.poll();
                int hd = temp.getHd();
                Node curr = temp.getRoot();
                //if(set.contains())
            }


        }

        public void verticalOrderTraversal(){
            Map<Integer, List<Integer>> map = new TreeMap<>();
            verticalOrderTraversal(root, 0, map);

            for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
                System.out.println(entry. getKey()+"---"+entry.getValue().get(0));
            }
        }

        public void verticalOrderTraversal(Node root, int hd, Map<Integer, List<Integer>> treeMap){

            if(root==null){
                return;
            }

            if(treeMap.containsKey(hd)){
                treeMap.get(hd).add(root.getData());
            }else{
                List<Integer> lst = new ArrayList<>();
                lst.add(root.getData());
                treeMap.put(hd, lst);
            }

            verticalOrderTraversal(root.getlChild(), hd-1, treeMap);
            verticalOrderTraversal(root.getrChild(), hd+1, treeMap);

        }

        public Node findLCA(Node root, int n1, int n2){

            if(root ==null)
                return null;

            if(root.getData()==n1 || root.getData()==n2)
                return root;

            Node left = findLCA(root.getlChild(), n1, n2);
            Node right = findLCA(root.getrChild(), n1, n2);

            if(left!=null && right!=null)
                return root;
            return left==null ? right : left;
        }



        private boolean printAllAncesstorsOfBinaryTree(Node root, int target){

            if(root==null)
                return false;
            if(root.getData()==target)
                return true;

            if(printAllAncesstorsOfBinaryTree(root.getlChild(), target)||
                    printAllAncesstorsOfBinaryTree(root.getrChild(), target)){
                System.out.print(root.getData()+"  ");
                return true;
            }
            return false;
        }

        private void printRootToLeafPaths(){
            int arr[] = new int[100];
            int count=-1;
            printRootToLeafPaths(root,arr, count);
        }

        private void printRootToLeafPaths(Node root, int arr[], int count){
            if(root==null)
                return;
            arr[++count]=root.getData();

            if(root.getlChild()==null&&root.getrChild()==null)
                printPaths(arr, count);

            printRootToLeafPaths(root.getlChild(), arr, count);
            printRootToLeafPaths(root.getrChild(), arr, count);
        }

        private void printPaths(int arr[], int count){
            for(int i=0; i<=count;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        private int getMaxWidthOfTree(Node root){
            int maxWidth=0;
            int height1=0;
            int height = getHeightOfTree(root);

            for(int i=1;i<=height;i++){
                height1=getMaxWidthOfTree(root, i);
                if(height1>maxWidth)
                    maxWidth=height1;
            }

            return maxWidth;
        }

        private int getMaxWidthOfTree(Node root, int level){
            if(root==null)
                return 0;

            if(level==1)
                return 1;

            return getMaxWidthOfTree(root.getlChild(), level-1)+getMaxWidthOfTree(root.getrChild(), level-1);

        }


        private boolean checkIfTwoTreesAreIdentical(Node root1, Node root2){
            if(root1==null&&root2==null)
                return true;
            if(root1==null||root2==null)
                return false;

            return(root1.getData()==root2.getData()
                    &&checkIfTwoTreesAreIdentical(root1.getlChild(),root2.getlChild())
                    &&checkIfTwoTreesAreIdentical(root1.getrChild(),root2.getrChild()));


        }

        private int diameter(Node root)
        {
        /* base case if tree is empty */
            if (root == null)
                return 0;

        /* get the height of left and right sub trees */
            int lheight = getHeightOfTree(root.getlChild());
            int rheight = getHeightOfTree(root.getrChild());

        /* get the diameter of left and right subtrees */
            int ldiameter = diameter(root.getlChild());
            int rdiameter = diameter(root.getrChild());

        /* Return max of following three
          1) Diameter of left subtree
         2) Diameter of right subtree
         3) Height of left subtree + height of right subtree + 1 */
            return Math.max(lheight + rheight + 1,
                    Math.max(ldiameter, rdiameter));

        }



        private int getDiameterOfTree(Node root){

            if(root==null)
                return 0;
            int left=getDiameterOfTree(root.getlChild());
            int right=getDiameterOfTree(root.getrChild());

            return(1+Math.max(left, right));

        }

        public void printLevelOrder(Node root)
        {
            int h = getHeightOfTree(root);
            int i;
            for (i=1; i<=h; i++)
            {
                printGivenLevel(root, i);
                System.out.println();
            }
        }
        /* Print nodes at a given level */
        void printGivenLevel(Node root, int level)
        {
            if (root == null)
                return;
            if (level == 1)
                System.out.println(root.getData());
            else if (level > 1)
            {
                printGivenLevel(root.getlChild(), level-1);
                printGivenLevel(root.getrChild(), level-1);
            }
        }

        private void getNumberOfLeafNodesInTree(){

            Queue<Node> queue= new LinkedList<Node>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node temp = queue.poll();
                if(temp.getlChild()==null&&temp.getrChild()==null)
                    System.out.println("Root element is :"+temp.getData());

                if(temp.getlChild()!=null)
                    queue.add(temp.getlChild());
                if(temp.getrChild()!=null)
                    queue.add(temp.getrChild());
            }

        }

        /*Prints the tree in
        * 1
        * 2 3
        * 4 5 6 7
        * As
        * 4 5 6 7 2 3 1*/
        public void printBinaryTreeInGivenOrder(){

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            Stack<Node> s = new Stack<>();

            while(true){

                Node temp = queue.poll();
                if(temp.getlChild()!=null)
                    queue.add(temp.getlChild());
                if(temp.getrChild()!=null)
                    queue.add(temp.getrChild());

                if(temp.getrChild()!=null)
                    s.push(temp.getrChild());
                if(temp.getlChild()!=null)
                    s.push(temp.getlChild());


            }
        }

        public int getHeightOfTree(Node root){

            if(root ==null)
                return 0;

            int lHeight = getHeightOfTree(root.getlChild());
            int rHeight = getHeightOfTree(root.getrChild());

            return (lHeight>rHeight) ? lHeight+1:rHeight+1;

        }

        public int getSizeOfBinaryTree(Node root){

            if(root==null)
                return 0;
            int lSize = getSizeOfBinaryTree(root.getlChild());
            int rSize = getSizeOfBinaryTree(root.getrChild());

            return lSize+rSize+1;
        }

        public boolean searchGivenElement(Node root, int data){

            if(root==null){
                return false;
            }
            boolean inLeftChild = searchGivenElement(root.getlChild(),data);
            boolean inRightChild =searchGivenElement(root.getrChild(),data);

            if(inLeftChild||inRightChild||root.getData()==data)
                return true;
            else
                return false;


        }

        public int getMaxElementInTree(Node root){
            int max = Integer.MIN_VALUE;

            if(root!=null){

                int lMax = getMaxElementInTree(root.getlChild());
                int rMax = getMaxElementInTree(root.getrChild());

                if(lMax<rMax)
                    max =rMax;
                else
                    max=lMax;
                if(root.getData()>max)
                    max=root.getData();

            }


            return max;

        }

        public void printTree(){
            if(root ==null)
                return;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(true){
                if(queue.isEmpty())
                    return;
                Node temp = queue.poll();
                System.out.println(temp.getData());

                if(temp.getlChild()!=null){
                    queue.add(temp.getlChild());
                }
                if(temp.getrChild()!=null)
                    queue.add(temp.getrChild());
            }

        }

        public void insert(int data){

            Node node = new Node(data);
            Queue<Node> queue = new LinkedList<>();
            if(root==null) {
                root = node;
                return;
            }

            queue.add(root);
            while(true){
                Node temp = queue.poll();
                if(temp.getlChild()!=null)
                    queue.add(temp.getlChild());
                else {
                    temp.setlChild(node);
                    return;
                }

                if(temp.getrChild()!=null)
                    queue.add(temp.getrChild());
                else{
                    temp.setrChild(node);
                    return;
                }
            }

        }

    }

