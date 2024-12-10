package X;

import android.content.ContentValues;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.7Pp  reason: invalid class name */
public class AnonymousClass7Pp implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass7Pp(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }

    public final void run() {
        if (this.A00 != 0) {
            String str = this.A03;
            long j = this.A01;
            C18070vi.A0d(str, 1);
            C126006c2 r0 = ((C132526mx) this.A02).A01;
            C17960vV.A00();
            C28791au A06 = r0.A00.A06();
            try {
                ContentValues A08 = C17880vN.A08();
                A08.put("chat_jid", str);
                C17880vN.A19(A08, "page_number", j);
                ((C28801av) A06).A02.A07("draft_voice_note_metadata", "draft_voice_note_metadata.INSERT_OR_PAGE_NUMBER_FOR_CHAT_JID", A08);
                A06.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A02;
            String str2 = this.A03;
            long j2 = this.A01;
            C18070vi.A0d(str2, 1);
            AnonymousClass00H r02 = addTextStatusActivity.A0C;
            if (r02 != null) {
                ((C136846uV) r02.get()).A02(j2, C29361c9.A0Q(str2, 60), false, addTextStatusActivity.A0D);
            } else {
                C18070vi.A11("myEvolvedAbout");
                throw null;
            }
        }
    }
}
