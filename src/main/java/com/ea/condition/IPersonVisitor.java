package com.ea.condition;

public interface IPersonVisitor
{
    void HandleMan(Man visitee);
    void HandleWoman(Woman visitee);
    void HandleBoy(Boy visitee);
    void HandleGirl(Girl visitee);
}