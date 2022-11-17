#pragma once

//Generic Node structure used in LinkList class

template<class G>
struct Node{
private:
	Node<G>* next;
	G data;
public:
  
	Node(G data_) {
		next = nullptr;
		data = data_;
	}
  
	Node<G>* getNext() {
		return next;
	}
  
	G getData() {
		return data;
	}
  
	void setNext(Node<G> * next_) {
		next = next_;
	}
  
	void setData(G data_) {
		data = data_;
	}
};
