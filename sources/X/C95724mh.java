package X;

/* renamed from: X.4mh  reason: invalid class name and case insensitive filesystem */
public final class C95724mh implements C108385bc {
    public boolean A00;
    public final String A01;

    public void CKy() {
        this.A00 = true;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C95724mh) && C18070vi.A18(this.A01, ((C95724mh) obj).A01));
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public /* synthetic */ String BPi() {
        return this.A01;
    }

    public String BQI() {
        return this.A01;
    }

    public boolean BZo() {
        return this.A00;
    }

    public C95724mh(String str) {
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrashEventData(stacktrace=");
        return C17900vP.A0B(this.A01, A10);
    }
}
