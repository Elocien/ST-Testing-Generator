package ConstraintMultisetAttributeGrammar;

import ContextFreeGrammar.CFGNonTerminalSymbol;
import java.util.List;
import java.util.UUID;

/**
 * The Non-Terminal instance of a {@linkplain CMAGSymbol}
 */
public class CMAGNonTerminalSymbol extends CMAGSymbol {

    public CMAGNonTerminalSymbol(Object object, List<Attribute> attributes) {
        super(object, attributes);
    }
    public CMAGNonTerminalSymbol(Object object, List<Attribute> attributes, UUID id) {
        super(object, attributes, id);
    }
    public CMAGNonTerminalSymbol(Object object, Attribute attribute) {
        super(object, attribute);
    }

    @Override
    public CMAGNonTerminalSymbol clone() {
        return new CMAGNonTerminalSymbol(this.getObject(), this.getAttributes(), this.getId());
    }
}
