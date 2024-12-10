package X;

import java.util.logging.Logger;

/* renamed from: X.CVs  reason: case insensitive filesystem */
public final class C25060CVs {
    public final String A00;
    public volatile Logger A01;

    public Logger A00() {
        Logger logger;
        Logger logger2 = this.A01;
        if (logger2 != null) {
            return logger2;
        }
        synchronized (this) {
            logger = this.A01;
            if (logger == null) {
                logger = Logger.getLogger(this.A00);
                this.A01 = logger;
            }
        }
        return logger;
    }

    public C25060CVs(Class cls) {
        this.A00 = cls.getName();
    }
}
