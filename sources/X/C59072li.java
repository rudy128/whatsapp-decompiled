package X;

import android.content.Intent;

/* renamed from: X.2li  reason: invalid class name and case insensitive filesystem */
public final class C59072li {
    public final Intent A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59072li) {
                C59072li r5 = (C59072li) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C59072li(Intent intent, String str) {
        this.A00 = intent;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsDownloadResponseData(intent=");
        A10.append(this.A00);
        A10.append(", fileName=");
        return C17900vP.A0B(this.A01, A10);
    }
}
