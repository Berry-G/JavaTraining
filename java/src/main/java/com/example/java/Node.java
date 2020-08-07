package com.example.java;

public class Node {
    //private : 외부에서 함부로 접근할 수 없음
    private int x;
    private int y;

    //public : 외부에서 접근 가능
    public int getX()
    {
        return x;
    }

    public void setX(){
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(){
        this.y = y;
    }

    // 생성자 : 인스턴스를 만들 때 자동으로 값을 넣어줌(자동 값 초기화), 클래스와 같은 이름을 가짐짐
    public Node(int x, int y){
       this.x = x;
       this.y = y;
    }

    public Node getCenter(Node other){
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY())/2);
    }

}
