package X;

/* renamed from: X.0Wk  reason: invalid class name and case insensitive filesystem */
public final class C05960Wk implements C17050tf {
    public long BFS(long j, long j2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Math.min(AnonymousClass0QG.A02(j2) / AnonymousClass0QG.A02(j), AnonymousClass0QG.A00(j2) / AnonymousClass0QG.A00(j)));
        long j3 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
        long j4 = AnonymousClass0GH.A00;
        return j3;
    }
}
