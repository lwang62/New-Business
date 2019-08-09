//290 Word pattern
//Easy
// hashmap 

public boolean 




// Two sum II 
// 167 easy 
// O(n^2)  two pointers brutal;
class Solution {
public int[] twoSum(int[] numbers, int target) {
    
    int [] sum = new int[2];
    
    for(int i = 0; i < numbers.length; i++){
        for(int j = i+1; j < numbers.length; j++){
            if(numbers[i] + numbers[j] == target){
                sum[0] = (i+1);
                sum[1] = (j+1);
            }
        }
    }
    return sum;
}
}

//246 Strobogrammatic Number
//Easy 
//O(n)
class Solution{
public boolean isStrobogrammatic(String num){

Map<Character,Character> map = new HaskMap<Character,Character>();
    map.put('6','9');
    map.put('9','6');
    map.put('0','0');
    map.put('1','1');
    map.put('8','8');
    int i = 0;
    int j = num.length() - 1; 
    if(!map.containKey(num.charAt(i)) || map.get(num.charAt(i)) != num.charAt(j)){return false;}
    i++;
    j--;

    }
    return true;
}



// 95 Binary Tree Inorder Traversal
// Medium
// recursively
//O(n)
public List<Integer> inorderTraversal(TreeNode root){
List<Integer> list = new ArrayList<Integer>();
if(root == null) return list;
if(root.left != null) {
    inorderTraversal(root.left);
}
list.add(root.val);
if(root.right != null) {
    inorderTraversal(root.right);
}
return list;

}


//102 binary tree traversal print

public List<Integer> inorderTraversal(TreeNode root){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(root == null) return list; 
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);
    while(!q.isEmpty()){
        int size = q.size();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < size;i++){
            TreeNode cur = q.poll();
            list.add(cur.val);
            if(cur.left != null){
                q.offer(cur.left);
            }

            if(cur.right !=null){
                q.offer(cur.right);
            }


        }

        res.add(list);

    }



    return res;








}

    


// 171 Excel sheet Coloum Number
//Easy 
// 26 进制的转换

public int titleToNumber(String s){ 
int res = 0; 
if(s.length == 0) return 0;
for(int i = 0; i< s.length(); i++){

    res= res*26 + s.charAt(i) - 'A' +1；

}
return res;
}




//118 Pascal's Triangle
// easy
public List<List<Integer>> generate(int numRows){


    
}




//387 first unique index 
//esay

public int firstUnique(String s){
    char[] arr = s.toCharArray();
    for(int i = 0; i< arr.length; i++){

        if(s.indexOf(arr[i]) == s.lastIndexOf(arr[i])){return i};

    }
  return -1;
}




//172 Factorial Traling Zeroes
//Easy
public int tralingZaroes(int n){

int res = n/5;
while(n/5 > 0){
    n /= 5;
    res = res + n/5;

}
return res; 


}


//160 Intersection of Two LinkedList 
//首先判断尾点是否一样
//O（m+n)
// Build len helper function 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA==null||headB==null) {
            return null;
        }
        int lengthA = 1;
        int lengthB = 1;
        
        ListNode iterA = headA;
        while(iterA.next!=null) {
            iterA = iterA.next;
            lengthA++;
        }
        
        ListNode iterB = headB;
        while(iterB.next!=null) {
            iterB = iterB.next;
            lengthB++;
        }
        
       /* if(iterA!=iterB) {
            return null;
        }
        */
        if(lengthA>lengthB) {
            int tmp = lengthA - lengthB;
            while(tmp>0) {
                iterA = iterA.next;
                tmp--;
            }
        } else {
            int tmp = lengthB - lengthA;
            while(tmp>0) {
                iterB = iterB.next;
                tmp--;
            }
        }
        
        
        
        
        while(iterA!=iterB) {
            iterA = iterA.next;
            iterB = iterB.next;
        }
        
        return headA;
    }


}
public int len(ListNode node){
    int len = 0; 
    while(node != null){
        node = node.next;
        len++;
    }
    return len; 
}

public ListNode getIntersectionNode1(ListNode headA, ListNode headB){

    if(headA = null || headB == null) {return null};
    int lenA = len(headA);
    int lenB = len(headB);

    if(lenA > lenB){
        while(lenA > lenB)
    }
    

}

 

// 509 Fibonacci Numbers Easy
//O(n)
public int fib(int N){
 if(N<2) return N;
 return fibtail(N,0,1);

}

private int fibtail(int N, int prev, int current){

    if(N<2) return current;
    return fibtail(N-1, current, prev+current);
}



//189 Rotate Array 
// Using Extra Array 
// i placed at i+k
// copy new array to the original one 

class Solution {
    public void rotate(int[] nums, int k) {
        int [] res = new int[nums.length];
        for(int i=0; i< nums.length;i++){
            res[(i+k)% nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = res[i];
        }
    }
}




//747 Largest Number At Least Twice of Others
//linear scan 
//O(n)

class Solution {
    public int dominantIndex(int[] nums) {
      int index = 0;
      for(int i=0; i< nums.length; i++){
      if(nums[i]>nums[index]) 
          index = i; 
      
      }
        for(int i=0; i<nums.length;i++){
            if(index != i && nums[index] < 2 * nums[i] )
                return -1;
        }
        
        return index;
    }
}


//1064 Fixed Point
// O(n)

class Solution {
    public int fixedPoint(int[] A) {
        for(int i=0; i<A.length; i++){
            if(A[i] == i){
                return i;
            }
            
        }
        return -1;
    }
}



//46 Medium Permutation

class Solution{
    List<List<Integer>> res = new ArrayList<List<List<Integer>>();


    public List<List<Integer>> permute (int[] nums){
        int length = nums.length;
        if(len == 0|| nums == null) return res;
        exchange(nums,0,len);
        return res;
    }


    public void exchange(int[] nums, int i, int len) {
        // 将当前数组加到结果集中
        if(i==len-1) {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<len; j++){
                list.add(nums[j]);
            }
            res.add(list);
            return ;
        }
        // 将当前位置的数跟后面的数交换，并搜索解
        for (int j=i; j<len; j++) {
            swap(nums, i, j);
            exchange(nums, i+1, len);
            swap(nums, i, j);
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




}

// 146 LRU Cache Medium
//O(1)
public LRUCache(int capacity) {

    super（capacity, 0.75F,true);
    this.capacity = capacity;

    
}

public int get(int key){
 return super.getOrDefault(key,-1);
}

public void put(int key, int value){
}

//15 Medium 3sum
class solution{

// change the list to ArrayList
List<List<Integer>> res  = new ArrayList<List<Integer>>();
       public 















}