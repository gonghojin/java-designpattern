package com.gongdel;

public abstract class Beast extends Prototype {

    @Override
    public abstract Beast clone() throws CloneNotSupportedException;

}
