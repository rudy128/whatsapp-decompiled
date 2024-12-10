package X;

import com.whatsapp.util.Log;
import java.io.PrintStream;

/* renamed from: X.CfS  reason: case insensitive filesystem */
public abstract class C25420CfS {
    public static C4Z A00 = new Object();

    public static void A00(Integer num, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C4Z c4z = A00;
        String obj = stackTrace[2].toString();
        if (c4z instanceof C24028BuF) {
            switch (num.intValue()) {
                case 1:
                    return;
                case 2:
                    C17900vP.A0f(" :", str, AnonymousClass000.A11(obj));
                    return;
                case 3:
                    Log.w(C17900vP.A0H(obj, " :", str).toString());
                    return;
                default:
                    C17900vP.A0e(" :", str, AnonymousClass000.A11(obj));
                    return;
            }
        } else {
            PrintStream printStream = System.err;
            StringBuilder A10 = AnonymousClass000.A10();
            BE7.A1N(A10, C24029BuG.A00(num));
            A10.append(obj);
            printStream.println(AnonymousClass001.A1H(" : ", str, A10));
        }
    }
}
