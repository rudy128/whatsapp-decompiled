package X;

/* renamed from: X.7SM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SM implements C22821Di {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;

    public final Object invoke(Object obj) {
        String str = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass84U r9 = (AnonymousClass84U) obj;
        C18070vi.A0d(r9, 4);
        r9.A01("music_song_id", str);
        r9.A01("music_song_start_time_in_ms", Long.valueOf(j));
        r9.A01("derived_content_start_time_in_ms", 0L);
        r9.A01("overlap_duration_in_ms", Long.valueOf(j2));
        return C27621Wu.A00;
    }

    public /* synthetic */ AnonymousClass7SM(long j, String str, long j2) {
        this.A02 = str;
        this.A00 = j;
        this.A01 = j2;
    }
}
