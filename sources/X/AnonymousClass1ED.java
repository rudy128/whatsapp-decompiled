package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1ED  reason: invalid class name */
public final class AnonymousClass1ED extends AnonymousClass1E1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1ED(String str) {
        super(str);
        AnonymousClass11T r1;
        C18070vi.A0d(str, 1);
        this.A02 = str;
        int length = str.length() - 1;
        int A0B = AnonymousClass1YF.A0B(str, '-', length);
        if (A0B == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid interop JID: ");
            sb.append(str);
            sb.append(" - must have a hyphen");
            throw new AnonymousClass11T(sb.toString());
        } else if (A0B != length) {
            String substring = str.substring(0, A0B);
            C18070vi.A0X(substring);
            String substring2 = str.substring(A0B + 1);
            C18070vi.A0X(substring2);
            int length2 = substring.length();
            if (length2 == 0 || length2 > 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid interop JID: ");
                sb2.append(str);
                sb2.append(" - integrator ID length must be 1-3");
                throw new AnonymousClass11T(sb2.toString());
            } else if (!substring.startsWith("0")) {
                try {
                    Integer.parseInt(substring);
                    try {
                        int length3 = substring2.length();
                        if (length3 < 1 || length3 > 15) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid account ID: ");
                            sb3.append(substring2);
                            sb3.append(" - length must be between 1 and 15");
                            r1 = new AnonymousClass11T(sb3.toString());
                        } else {
                            int i = 0;
                            if (!substring2.startsWith("0")) {
                                char[] charArray = substring2.toCharArray();
                                C18070vi.A0X(charArray);
                                int length4 = charArray.length;
                                while (i < length4) {
                                    char c = charArray[i];
                                    if (C18070vi.A00(c, 48) < 0 || C18070vi.A00(c, 57) > 0) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("Invalid account ID: ");
                                        sb4.append(substring2);
                                        sb4.append(" - must be numeric only");
                                        r1 = new AnonymousClass11T(sb4.toString());
                                    } else {
                                        i++;
                                    }
                                }
                                try {
                                    C19760yx r12 = new C19760yx(Integer.valueOf(Integer.parseInt(substring)), substring2);
                                    Object obj = r12.A00;
                                    C18070vi.A0W(obj);
                                    this.A00 = ((Number) obj).intValue();
                                    Object obj2 = r12.A01;
                                    C18070vi.A0W(obj2);
                                    this.A01 = (String) obj2;
                                    return;
                                } catch (NumberFormatException unused) {
                                    throw new AnonymousClass11T("Could not parse integrator as integer");
                                }
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Invalid account ID: ");
                                sb5.append(substring2);
                                sb5.append(" - cannot start with 0");
                                r1 = new AnonymousClass11T(sb5.toString());
                            }
                        }
                        throw r1;
                    } catch (AnonymousClass11T e) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Invalid interop JID: ");
                        sb6.append(str);
                        sb6.append(" - account ID failed validation");
                        throw new AnonymousClass11T(sb6.toString(), e);
                    }
                } catch (NumberFormatException e2) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Invalid interop JID: ");
                    sb7.append(str);
                    sb7.append(" - integrator ID could not be parsed as number");
                    throw new AnonymousClass11T(sb7.toString(), e2);
                }
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Invalid interop JID: ");
                sb8.append(str);
                sb8.append(" - integrator ID cannot start with 0");
                throw new AnonymousClass11T(sb8.toString());
            }
        } else {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Invalid interop JID: ");
            sb9.append(str);
            sb9.append(" - missing account ID");
            throw new AnonymousClass11T(sb9.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 22;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
    }

    public String getServer() {
        return "interop";
    }
}
