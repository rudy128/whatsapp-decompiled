package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2pn  reason: invalid class name and case insensitive filesystem */
public class C61502pn {
    public static int A03;
    public AnonymousClass1s7 A00;
    public AnonymousClass1s7 A01;
    public ArrayList A02;

    public static long A00(AnonymousClass1s9 r9, C61502pn r10, long j) {
        AnonymousClass1s7 r4 = r9.A05;
        if (r4 instanceof AnonymousClass27Q) {
            return j;
        }
        List list = r9.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AnonymousClass1s6 r8 = (AnonymousClass1s6) list.get(i);
            if (r8 instanceof AnonymousClass1s9) {
                AnonymousClass1s9 r82 = (AnonymousClass1s9) r8;
                if (r82.A05 != r4) {
                    j2 = Math.min(j2, A00(r82, r10, ((long) r82.A00) + j));
                }
            }
        }
        if (r9 != r4.A03) {
            return j2;
        }
        long A05 = r4.A05();
        AnonymousClass1s9 r42 = r4.A04;
        long j3 = j - A05;
        return Math.min(Math.min(j2, A00(r42, r10, j3)), j3 - ((long) r42.A00));
    }

    public static long A01(AnonymousClass1s9 r9, C61502pn r10, long j) {
        AnonymousClass1s7 r4 = r9.A05;
        if (r4 instanceof AnonymousClass27Q) {
            return j;
        }
        List list = r9.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            AnonymousClass1s6 r8 = (AnonymousClass1s6) list.get(i);
            if (r8 instanceof AnonymousClass1s9) {
                AnonymousClass1s9 r82 = (AnonymousClass1s9) r8;
                if (r82.A05 != r4) {
                    j2 = Math.max(j2, A01(r82, r10, ((long) r82.A00) + j));
                }
            }
        }
        if (r9 != r4.A04) {
            return j2;
        }
        long A05 = r4.A05();
        AnonymousClass1s9 r42 = r4.A03;
        long j3 = j + A05;
        return Math.max(Math.max(j2, A01(r42, r10, j3)), j3 - ((long) r42.A00));
    }
}
