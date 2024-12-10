package X;

import android.os.Bundle;
import android.os.Message;

public final class A69 {
    public final Bundle A00;
    public final Message A01;
    public final Object A02;
    public final String A03;

    public A69(Message message, String str) {
        C18070vi.A0d(message, 2);
        this.A03 = str;
        this.A00 = null;
        this.A01 = message;
        this.A02 = null;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("action=");
        A10.append(this.A03);
        A10.append(", args=");
        A10.append(this.A00);
        A10.append(", message=");
        return C17890vO.A0V(this.A01, A10);
    }

    public A69(String str) {
        this.A03 = str;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public A69(String str, Bundle bundle) {
        C18070vi.A0d(str, 1);
        this.A03 = str;
        this.A00 = bundle;
        this.A01 = null;
        this.A02 = null;
    }

    public A69(String str, Object obj) {
        this.A03 = str;
        this.A00 = null;
        this.A01 = null;
        this.A02 = obj;
    }
}
