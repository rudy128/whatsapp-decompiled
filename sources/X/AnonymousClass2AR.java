package X;

/* renamed from: X.2AR  reason: invalid class name */
public final class AnonymousClass2AR extends C49612Re {
    public final long A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C49612Re)) {
                return false;
            }
            AnonymousClass2AR r7 = (AnonymousClass2AR) ((C49612Re) obj);
            if (!(this.A02.equals(r7.A02) && this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass2AR(long j, String str, long j2) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return ((((1000003 ^ this.A02.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstallationTokenResult{token=");
        A10.append(this.A02);
        A10.append(", tokenExpirationTimestamp=");
        A10.append(this.A01);
        A10.append(", tokenCreationTimestamp=");
        A10.append(this.A00);
        return AnonymousClass000.A0y("}", A10);
    }
}
