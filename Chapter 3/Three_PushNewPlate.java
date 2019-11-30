class Three_PushNewPlate {

  void push(int V) {
    Stack last = getLastStack();
    if(last != null && !last.isFull()) {
      last.push(V);
    }
    else {
      Stack stack = new Stack(capactiy);
      stack.push(v);
      stacka.add(stack);
    }
  }
}
