package X;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public enum C09 {
    GTE(">="),
    LTE("<="),
    EQ("=="),
    TSEQ("==="),
    NE("!="),
    TSNE("!=="),
    LT("<"),
    GT(">"),
    REGEX("=~"),
    NIN("NIN"),
    IN("IN"),
    CONTAINS("CONTAINS"),
    ALL("ALL"),
    SIZE("SIZE"),
    EXISTS("EXISTS"),
    TYPE(CredentialProviderBaseController.TYPE_TAG),
    MATCHES("MATCHES"),
    EMPTY("EMPTY"),
    SUBSETOF("SUBSETOF"),
    ANYOF("ANYOF"),
    NONEOF("NONEOF");
    
    public final String operatorString;

    public String toString() {
        return this.operatorString;
    }

    /* access modifiers changed from: public */
    C09(String str) {
        this.operatorString = str;
    }
}
