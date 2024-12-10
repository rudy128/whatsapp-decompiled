package X;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7yO  reason: invalid class name */
public final class AnonymousClass7yO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceMultimodalComposerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yO(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        super(1);
        this.this$0 = metaAiVoiceMultimodalComposerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00H r0;
        String str;
        C140016zo r7 = (C140016zo) obj;
        if (r7 != null) {
            MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity = this.this$0;
            LinearLayoutCompat linearLayoutCompat = metaAiVoiceMultimodalComposerActivity.A01;
            if (linearLayoutCompat == null) {
                str = "contentContainer";
            } else {
                linearLayoutCompat.setGravity(48);
                Map map = metaAiVoiceMultimodalComposerActivity.A0L;
                Iterator A0l = C17890vO.A0l(map);
                while (A0l.hasNext()) {
                    C72453Mb.A1B(((C136786uO) A0l.next()).A01);
                }
                AnonymousClass6R6 r4 = r7.A01;
                int ordinal = r4.ordinal();
                if (ordinal == 0) {
                    metaAiVoiceMultimodalComposerActivity.A0C = null;
                } else {
                    Object obj2 = map.get(r4);
                    if (obj2 == null) {
                        if (ordinal == 1) {
                            r0 = metaAiVoiceMultimodalComposerActivity.A0G;
                            if (r0 == null) {
                                str = "metaAiVoiceTextResponseComponent";
                            }
                        } else if (ordinal == 2) {
                            r0 = metaAiVoiceMultimodalComposerActivity.A0D;
                            if (r0 == null) {
                                str = "metaAiVoiceImageResponseComponent";
                            }
                        } else if (ordinal != 3) {
                            r0 = metaAiVoiceMultimodalComposerActivity.A0E;
                            if (r0 == null) {
                                str = "metaAiVoiceReelsResponseComponent";
                            }
                        } else {
                            r0 = metaAiVoiceMultimodalComposerActivity.A0F;
                            if (r0 == null) {
                                str = "metaAiVoiceSearchResponseComponent";
                            }
                        }
                        obj2 = (C136786uO) r0.get();
                        C18070vi.A0b(obj2);
                        map.put(r4, obj2);
                    }
                    C136786uO r2 = (C136786uO) obj2;
                    metaAiVoiceMultimodalComposerActivity.A0C = r2;
                    View view = metaAiVoiceMultimodalComposerActivity.A00;
                    C18070vi.A0X(view);
                    r2.A03(view, metaAiVoiceMultimodalComposerActivity, C108945cZ.A0m(metaAiVoiceMultimodalComposerActivity.A0N));
                    C108975cc.A0q(r2.A01);
                    r2.A02(metaAiVoiceMultimodalComposerActivity, metaAiVoiceMultimodalComposerActivity.A0K, r7);
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
