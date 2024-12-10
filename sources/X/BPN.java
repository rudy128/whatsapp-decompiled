package X;

import java.io.IOException;

public class BPN extends C24214BxR {
    public final C26115Csd dataSpec;
    public final int type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public BPN(C26115Csd csd, IOException iOException, int i) {
        super(i == 1 ? 2001 : 2000, (Throwable) iOException);
        this.dataSpec = csd;
        this.type = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BPN(C26115Csd csd, IOException iOException, String str, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.dataSpec = csd;
        this.type = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public BPN(C26115Csd csd, String str, int i) {
        super(str, i == 1 ? 2001 : 2000);
        this.dataSpec = csd;
        this.type = i;
    }
}
