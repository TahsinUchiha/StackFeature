package com.infosys.testing.StackFeature;

import java.util.Stack;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class StackFeatureSteps {
	
	private StackFeature myStack;
	private Object pushed;
	private Object popped;
	
	@Before
	public void setUp() {
		myStack = new StackFeature();
		
	}
	
	@Given("^an empty stack$")
	public void an_empty_stack()  {
		myStack = new StackFeature();

	}

	@When("^I push an item into the stack$")
	public void i_push_an_item_into_the_stack()  {
		pushed = new Object();
	    myStack.push(pushed);
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item() {
		
		assertEquals(1, myStack.size());
	}

	@When("^I push another item into the stack$")
	public void i_push_another_item_into_the_stack() {
		i_push_an_item_into_the_stack();
		
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items() {
		
		assertEquals(2, myStack.size());
	}

	@When("^I pop from the stack$")
	public void i_pop_from_the_stack() {
		Object out = myStack.pop();
		popped = out;
	}

	@Then("^I get the same item back$")
	public void i_get_the_same_item_back(){
		
		assertEquals(pushed, popped);
	} 

	@Given("^a stack with (\\d+) items$")
	public void a_stack_with_items(int arg1) {
		
		myStack.push("a");
		myStack.push("a");
		myStack.push("a");
		
		assertEquals(3, myStack.size());
	}
	
	@After
	public void after() {
	
	}



}
