package X;

import com.whatsapp.productinfra.music.api.MusicApi;
import org.json.JSONObject;

/* renamed from: X.7SN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SN implements C22821Di {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MusicApi A02;
    public final /* synthetic */ String A03;

    public final Object invoke(Object obj) {
        String str;
        MusicApi musicApi = this.A02;
        String str2 = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass84U r10 = (AnonymousClass84U) obj;
        C18070vi.A0g(str2, 1, r10);
        AnonymousClass7SM r3 = new AnonymousClass7SM(j, str2, j2);
        JSONObject jSONObject = new JSONObject();
        r3.invoke(jSONObject);
        r10.put("music_song_usage", jSONObject);
        String A032 = ((C27091Ur) musicApi.A00.get()).A03();
        if (A032 != null) {
            str = C108975cc.A0e(A032);
        } else {
            str = null;
        }
        r10.A01("country", str);
        return C27621Wu.A00;
    }

    public /* synthetic */ AnonymousClass7SN(MusicApi musicApi, String str, long j, long j2) {
        this.A02 = musicApi;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }
}
