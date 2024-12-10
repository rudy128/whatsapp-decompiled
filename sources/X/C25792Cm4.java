package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Cm4  reason: case insensitive filesystem */
public final class C25792Cm4 {
    public static final C25792Cm4 A03 = new C25792Cm4(53264);
    public static final C25792Cm4 A04 = new C25792Cm4(53252);
    public static final C25792Cm4 A05 = new C25792Cm4(53250);
    public static final C25792Cm4 A06 = new C25792Cm4(53281);
    public static final C25792Cm4 A07 = new C25792Cm4(49156);
    public static final C25792Cm4 A08 = new C25792Cm4(0);
    public static final C25792Cm4 A09 = new C25792Cm4(49155);
    public static final C25792Cm4 A0A = new C25792Cm4(53251);
    public static final C25792Cm4 A0B = new C25792Cm4(49154);
    public static final C25792Cm4 A0C = new C25792Cm4(49153);
    public static final C25792Cm4 A0D = new C25792Cm4(53249);
    public final int A00;
    public final Integer A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.wearable.datax.Error");
                if (this.A00 != ((C25792Cm4) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00 + 7;
    }

    public C25792Cm4(int i) {
        Integer num;
        int i2;
        this.A00 = i;
        Integer[] A002 = AnonymousClass00R.A00(16);
        int length = A002.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                num = A002[i3];
                int i4 = this.A00;
                switch (num.intValue()) {
                    case 1:
                        i2 = 49153;
                        break;
                    case 2:
                        i2 = 49154;
                        break;
                    case 3:
                        i2 = 49155;
                        break;
                    case 4:
                        i2 = 49156;
                        break;
                    case 5:
                        i2 = 49157;
                        break;
                    case 6:
                        i2 = 49158;
                        break;
                    case 7:
                        i2 = 53249;
                        break;
                    case 8:
                        i2 = 53250;
                        break;
                    case 9:
                        i2 = 53251;
                        break;
                    case 10:
                        i2 = 53252;
                        break;
                    case 11:
                        i2 = 53264;
                        break;
                    case 12:
                        i2 = 53280;
                        break;
                    case 13:
                        i2 = 53281;
                        break;
                    case 14:
                        i2 = 57345;
                        break;
                    case 15:
                        i2 = 65536;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i4 != i2) {
                    i3++;
                }
            } else {
                num = AnonymousClass00R.A07;
            }
        }
        this.A01 = num;
        C25792Cm4[] cm4Arr = new C25792Cm4[3];
        cm4Arr[0] = A0C;
        cm4Arr[1] = A0B;
        this.A02 = C18070vi.A0O(A09, cm4Arr, 2);
        int i5 = this.A00;
        if (i5 < 0 || i5 > 65535) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(i5);
            throw AnonymousClass000.A0o(" must be unsigned 16bit", A10);
        }
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(0x");
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        String format = String.format("%04x", Arrays.copyOf(A1a, 1));
        C18070vi.A0X(format);
        BE7.A1N(A10, format);
        int intValue = this.A01.intValue();
        if (intValue == 15) {
            str = "This code doesn't match to a known error type, please reach out to the connectivityteam or the owners of the service you are trying to communicate with on the deviceteam to figure out what this code means.";
        } else if (intValue != 5) {
            switch (intValue) {
                case 1:
                    str = "SERVICE_NOT_FOUND";
                    break;
                case 2:
                    str = "SERVICE_LOST";
                    break;
                case 3:
                    str = "OUT_OF_CHANNELS";
                    break;
                case 4:
                    str = "INTERNAL_ERROR";
                    break;
                case 6:
                    str = "CHANNEL_CLOSED";
                    break;
                case 7:
                    str = "UNKNOWN_TYPE";
                    break;
                case 8:
                    str = "DEPRECATED_TYPE";
                    break;
                case 9:
                    str = "REMOVED_TYPE";
                    break;
                case 10:
                    str = "BAD_TYPE";
                    break;
                case 11:
                    str = "BAD_REQUEST";
                    break;
                case 12:
                    str = "SERIALIZE_FAILED";
                    break;
                case 13:
                    str = "DESERIALIZE_FAILED";
                    break;
                case 14:
                    str = "WRITE_WOULD_BLOCK";
                    break;
                default:
                    str = "OK";
                    break;
            }
        } else {
            str = "Message is too long. DataX cannot send messages longer than 16383 bytes. Try fragmenting your data into more messages, for example if you're sending a list of contacts then send each contact in a separate message instead of all in one big list.";
        }
        return C17900vP.A0B(str, A10);
    }
}
