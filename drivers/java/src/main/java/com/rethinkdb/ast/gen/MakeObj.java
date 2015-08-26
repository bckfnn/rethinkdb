// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/gen/MakeObj.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class MakeObj extends ReqlQuery {


    public MakeObj(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public MakeObj(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public MakeObj(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.MAKE_OBJ, args, optargs);
    }
    protected MakeObj(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static MakeObj fromArgs(java.lang.Object... args){
        return new MakeObj(new Arguments(args), null);
    }


    public static MakeObj fromMap(java.util.Map<String, ReqlAst> map){
        return new MakeObj(OptArgs.fromMap(map));
    }

}