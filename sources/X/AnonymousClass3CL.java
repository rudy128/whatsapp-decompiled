package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3CL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C54432e8 A03;
    public final /* synthetic */ C61632q0 A04;
    public final /* synthetic */ short A05;

    public final void run() {
        C61632q0 r5 = this.A04;
        C54432e8 r4 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        short s = this.A05;
        long j = this.A02;
        HashMap A11 = C17880vN.A11();
        String str = r5.A03;
        if (str != null) {
            A11.put("direct_connection_status", str);
        }
        String str2 = r5.A01;
        if (str2 != null) {
            A11.put("biz_id", str2);
        }
        String str3 = r5.A02;
        if (str3 != null) {
            A11.put("biz_type", str3);
        }
        String str4 = r5.A04;
        if (str4 != null) {
            A11.put("server_origin", str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(A11);
        C18070vi.A0X(unmodifiableMap);
        Iterator A15 = AnonymousClass000.A15(unmodifiableMap);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            r4.A00.markerAnnotate(i, i2, C17880vN.A0x(A16), (String) A16.getValue());
        }
        HashMap A112 = C17880vN.A11();
        Boolean bool = r5.A00;
        if (bool != null && bool.booleanValue()) {
            A112.put("cached", AnonymousClass000.A0i());
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(A112);
        C18070vi.A0X(unmodifiableMap2);
        Iterator A152 = AnonymousClass000.A15(unmodifiableMap2);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            r4.A00.markerAnnotate(i, i2, C17880vN.A0x(A162), AnonymousClass000.A1Y(A162.getValue()));
        }
        r4.A00.markerEnd(i, i2, s, j, TimeUnit.MILLISECONDS);
    }

    public /* synthetic */ AnonymousClass3CL(C54432e8 r1, C61632q0 r2, int i, int i2, long j, short s) {
        this.A04 = r2;
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = s;
        this.A02 = j;
    }
}
