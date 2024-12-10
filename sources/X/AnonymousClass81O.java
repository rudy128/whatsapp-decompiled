package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import java.util.ArrayList;

/* renamed from: X.81O  reason: invalid class name */
public final class AnonymousClass81O extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81O(StickerInfoBottomSheet stickerInfoBottomSheet) {
        super(1);
        this.this$0 = stickerInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        int i;
        C123226Tp r10 = (C123226Tp) obj;
        if (r10 instanceof AnonymousClass6HR) {
            StickerInfoBottomSheet.A01(this.this$0);
            StickerInfoBottomSheet stickerInfoBottomSheet = this.this$0;
            AnonymousClass1BI r3 = stickerInfoBottomSheet.A04;
            if (r3 != null) {
                AnonymousClass00H r0 = stickerInfoBottomSheet.A0L;
                if (r0 != null) {
                    r0.get();
                    AnonymousClass6HR r102 = (AnonymousClass6HR) r10;
                    Uri uri = r102.A01;
                    int i2 = r102.A00;
                    AnonymousClass1FL A1D = stickerInfoBottomSheet.A1D();
                    C18070vi.A0b(A1D);
                    C138046wR.A00(A1D, uri, r3, i2);
                } else {
                    str = "stickerMakerActions";
                    C18070vi.A11(str);
                    throw null;
                }
            }
        } else if (r10 instanceof AnonymousClass6HQ) {
            StickerInfoBottomSheet.A01(this.this$0);
            StickerInfoBottomSheet stickerInfoBottomSheet2 = this.this$0;
            AnonymousClass1BI r4 = stickerInfoBottomSheet2.A04;
            if (r4 != null) {
                AnonymousClass00H r02 = stickerInfoBottomSheet2.A0M;
                if (r02 != null) {
                    C139076yA r2 = (C139076yA) r02.get();
                    AnonymousClass6HQ r103 = (AnonymousClass6HQ) r10;
                    int i3 = r103.A00;
                    AnonymousClass1FL A1D2 = stickerInfoBottomSheet2.A1D();
                    C122606Ra r03 = stickerInfoBottomSheet2.A07;
                    if (r03 == null) {
                        str = "origin";
                    } else {
                        switch (r03.ordinal()) {
                            case 0:
                            case 4:
                            case 8:
                                i = 12;
                                break;
                            case 1:
                            case 2:
                            case 3:
                                i = 11;
                                break;
                            case 5:
                                i = 10;
                                break;
                            case 6:
                                i = 14;
                                break;
                            case 7:
                                i = 9;
                                break;
                            default:
                                throw AnonymousClass3MW.A14();
                        }
                        AnonymousClass778 r5 = r103.A01;
                        C18070vi.A0b(A1D2);
                        r2.A01(A1D2, r4, r5, i3, i, true);
                    }
                } else {
                    str = "stickerMakerBottomSheetProviderFactory";
                }
                C18070vi.A11(str);
                throw null;
            }
        } else if (r10 instanceof AnonymousClass6HP) {
            StickerInfoBottomSheet.A01(this.this$0);
            StickerInfoBottomSheet stickerInfoBottomSheet3 = this.this$0;
            AnonymousClass1FL A1B = stickerInfoBottomSheet3.A1B();
            if (A1B != null) {
                AnonymousClass00H r04 = stickerInfoBottomSheet3.A0G;
                if (r04 != null) {
                    r04.get();
                    AnonymousClass1FU r42 = (AnonymousClass1FU) A1B;
                    C1418377d[] r22 = new C1418377d[1];
                    C1418377d r1 = stickerInfoBottomSheet3.A05;
                    if (r1 == null) {
                        C18070vi.A11("sticker");
                        throw null;
                    }
                    r22[0] = r1;
                    ArrayList A05 = AnonymousClass1ZU.A05(r22);
                    Bundle A0D = C17880vN.A0D();
                    A0D.putParcelableArrayList("arg_stickers", A05);
                    StickerAddToPackBottomSheet stickerAddToPackBottomSheet = new StickerAddToPackBottomSheet();
                    stickerAddToPackBottomSheet.A1R(A0D);
                    r42.CMl(stickerAddToPackBottomSheet);
                } else {
                    str = "customStickerPackStore";
                    C18070vi.A11(str);
                    throw null;
                }
            }
        } else if (r10 instanceof AnonymousClass6HT) {
            this.this$0.A0T = true;
        }
        this.this$0.A28();
        return C27621Wu.A00;
    }
}
