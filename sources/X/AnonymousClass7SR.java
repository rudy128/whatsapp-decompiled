package X;

import com.whatsapp.productinfra.music.api.MusicApi;
import org.json.JSONObject;

/* renamed from: X.7SR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SR implements C22821Di {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MusicApi A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final Object invoke(Object obj) {
        int i = this.A00;
        String str = this.A02;
        MusicApi musicApi = this.A01;
        String str2 = this.A03;
        String str3 = this.A04;
        String str4 = this.A05;
        AnonymousClass84U r10 = (AnonymousClass84U) obj;
        C108965cb.A1O(str, 1, r10);
        AnonymousClass7SQ r3 = new AnonymousClass7SQ(musicApi, str2, str3, str, str4);
        JSONObject jSONObject = new JSONObject();
        r3.invoke(jSONObject);
        r10.put("params", jSONObject);
        Integer valueOf = Integer.valueOf(i);
        r10.A01("artwork_width", valueOf);
        r10.A01("artwork_height", valueOf);
        r10.A01("browse_session_id", str);
        return C27621Wu.A00;
    }

    public /* synthetic */ AnonymousClass7SR(MusicApi musicApi, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = musicApi;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
