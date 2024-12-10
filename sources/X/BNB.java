package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class BNB extends C6L {
    public C22821Di A00;
    public final C25118CYr A01 = new C25118CYr();
    public final C25118CYr A02 = new C25118CYr();
    public final HashMap A03 = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.BG4, android.os.Handler] */
    public BNB(Looper looper) {
        this.A01 = "sup:MediaStreamState";
        ? handler = new Handler(looper);
        handler.A0B = false;
        handler.A05 = new C24905COy();
        handler.A00 = -1;
        BN8 bn8 = new BN8(handler);
        handler.A06 = bn8;
        handler.A07 = new BN9(handler);
        handler.A0A = C17880vN.A11();
        handler.A09 = AnonymousClass000.A13();
        handler.A08 = this;
        BG4.A00(bn8, (C6B) null, handler);
        BG4.A00(handler.A07, (C6B) null, handler);
        this.A00 = handler;
    }

    public static C22874BTj A00(BNB bnb, Throwable th) {
        StringBuilder sb = new StringBuilder();
        bnb.A05(sb);
        sb.toString();
        return new C22874BTj(th);
    }

    public final void A05(StringBuilder sb) {
        String str;
        ArrayList arrayList;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State machine ");
        A10.append(this.A01);
        printWriter.println(C17890vO.A0c(A10, ':'));
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Current state ");
        C6B A032 = A03();
        if (A032 != null) {
            str = A032.A00();
        } else {
            str = null;
        }
        printWriter.println(AnonymousClass000.A0y(str, A102));
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        C25118CYr cYr = this.A02;
        if (cYr != null) {
            arrayList = cYr.A00();
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            printWriter.println("State transition history:");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CN3 cn3 = (CN3) it.next();
                printWriter.printf("%s  %s", new Object[]{AnonymousClass8BU.A0r(dateTimeInstance, cn3.A00), cn3.A01});
                printWriter.println();
            }
        } else {
            printWriter.println("State transition history is disabled");
        }
        printWriter.println();
        printWriter.println("Event history:");
        Iterator it2 = this.A01.A00().iterator();
        while (it2.hasNext()) {
            CN3 cn32 = (CN3) it2.next();
            printWriter.printf("%s  %s", new Object[]{AnonymousClass8BU.A0r(dateTimeInstance, cn32.A00), cn32.A01});
            printWriter.println();
        }
        AnonymousClass8BS.A1D(stringWriter, sb);
    }

    public final void A04(C24426C3b c3b) {
        int A0M;
        Class<?> cls = c3b.getClass();
        synchronized (this) {
            C18070vi.A0d(cls, 0);
            HashMap hashMap = this.A03;
            Object obj = hashMap.get(cls);
            if (obj == null) {
                obj = Integer.valueOf(hashMap.size());
                hashMap.put(cls, obj);
            }
            A0M = AnonymousClass000.A0M(obj);
        }
        BG4 bg4 = this.A00;
        if (bg4 != null) {
            bg4.sendMessage(Message.obtain(bg4, A0M, c3b));
        }
    }
}
