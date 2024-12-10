package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.7xz  reason: invalid class name and case insensitive filesystem */
public final class C157737xz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157737xz(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        List list = (List) obj;
        AiImagineBottomSheet aiImagineBottomSheet = this.this$0;
        if (list != null && !list.isEmpty()) {
            RecyclerView recyclerView = aiImagineBottomSheet.A0B;
            if (recyclerView != null) {
                C108965cb.A0z(aiImagineBottomSheet.A14(), recyclerView);
            }
            AnonymousClass118 r0 = aiImagineBottomSheet.A0M;
            if (r0 != null) {
                File A0e = C17880vN.A0e(C108945cZ.A16(r0), "SuggestionsCache");
                if (!A0e.mkdirs() && !A0e.isDirectory()) {
                    Log.w("/cache/unable to create directory");
                }
                RecyclerView recyclerView2 = aiImagineBottomSheet.A0B;
                if (recyclerView2 != null) {
                    C125606bM r2 = new C125606bM(aiImagineBottomSheet);
                    AnonymousClass10I r8 = aiImagineBottomSheet.A0d;
                    if (r8 != null) {
                        AnonymousClass1KB r5 = aiImagineBottomSheet.A0F;
                        if (r5 != null) {
                            AnonymousClass181 r6 = aiImagineBottomSheet.A0G;
                            if (r6 != null) {
                                AnonymousClass1D9 r7 = aiImagineBottomSheet.A0P;
                                if (r7 != null) {
                                    recyclerView2.setAdapter(new AnonymousClass3Wb(r2, new C86284Ra(r5, r6, r7, r8, A0e, "sugg-cache").A00(), list));
                                } else {
                                    str = "waHttpClient";
                                }
                            } else {
                                str = "statistics";
                            }
                        } else {
                            str = "globalUI";
                        }
                    } else {
                        str = "waWorkers";
                    }
                }
            } else {
                str = "waContext";
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
