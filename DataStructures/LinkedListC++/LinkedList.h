#pragma once
#include "Node.h"
#include <string>

//Generic LinkedList class

template<class G> 
class LinkedList {
private:
	Node<G>* head = nullptr;

	//Returns node at specified index
	Node<G>* getNode(int index) {
		int i = 0;
		Node<G>* cur = head;
		while (i < index && cur != nullptr) {
			cur = cur->getNext();
			i++;
		}
		if (cur != nullptr)
			return cur;
		else
			return NULL;
	}
public:
	//Returns the head of the linked list without poppng
	G getHead() {
		return head->getData();
	}
	//Adds a node to the linked list
	void add(Node<G> * n) {
		if (head == nullptr) {
			head = n;
		}
		else {
			Node<G>* cur = head;
			if (cur != nullptr) {
				while (cur->getNext() != nullptr) {
					cur = cur->getNext();
				}
			}
			cur->setNext(n);
		}
	}

	//Adds a generic object to linked list
	void add(G data) {
		this->add(new Node<G>(data));
	}

	//Returns value at specified index
	G get(int index) {
		int i = 0;
		Node<G>* cur = head;
		while (i < index && cur != nullptr) {
			cur = cur->getNext();
			i++;
		}
		if (cur != nullptr)
			return cur->getData();
		else
			return NULL;
	}
	
	//Returns number of nodes in linked list
	int size() {
		int size;
		if (head == nullptr) {
			return 0;
		}
		else {
			Node<G>* cur = head;
			size = 1;
			if (cur != nullptr) {
				while (cur->getNext() != nullptr) {
					cur = cur->getNext();
					size++;
				}
			}
			return size;
		}
	}

	//pops first node
	G pop() {
		Node<G>* temp = head;
		G returnVal = head->getData();
		head = head->getNext();

		delete temp;
		return returnVal;
	}

	//Removes node at specified index
	G remove(int index) {
		if (index == 0)
			this->pop();
		else{
			int i = 0;
			Node<G>* cur = head;
			Node<G>* prev = cur;
			while (i < index && cur != nullptr) {
				prev = cur;
				cur = cur->getNext();
				i++;
			}
			if (cur != nullptr) {
				prev->setNext(cur->getNext());
				G temp = cur->getData();
				delete cur;
				return temp;
			}
			else
				return NULL;
		}
	}

	//Destructor
	~LinkedList() {
		if (head != nullptr) {
			Node<G>* cur = head;
			while (cur != NULL) {
				Node<G>* temp = cur;
				cur = cur->getNext();
				delete temp;
			}
		}
	}
};
