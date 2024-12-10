package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7P3  reason: invalid class name */
public class AnonymousClass7P3 implements C107745aW {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7P3(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void Bq8() {
        String str;
        AnonymousClass206 r1;
        boolean z;
        Intent intent;
        if (this.A00 != 0) {
            GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A03;
            Object obj = this.A01;
            List list = (List) this.A02;
            AnonymousClass10I r8 = galleryTabHostFragment.A0L;
            if (r8 != null) {
                AnonymousClass6ZQ r4 = galleryTabHostFragment.A05;
                if (r4 != null) {
                    List A0M = C18070vi.A0M(obj);
                    Set set = galleryTabHostFragment.A0l;
                    AnonymousClass73D r11 = galleryTabHostFragment.A0k;
                    if (GalleryTabHostFragment.A04(galleryTabHostFragment) > 0) {
                        AnonymousClass00H r12 = galleryTabHostFragment.A0N;
                        if (r12 != null) {
                            AnonymousClass1W6 A0c = C17880vN.A0c(r12);
                            r1 = A0c.A01.A03(GalleryTabHostFragment.A04(galleryTabHostFragment));
                        } else {
                            str = "fMessageDatabase";
                        }
                    } else {
                        AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(GalleryTabHostFragment.A0C(galleryTabHostFragment));
                        r1 = null;
                        if (A022 != null) {
                            AnonymousClass11P r2 = galleryTabHostFragment.A0A;
                            if (r2 != null) {
                                r1 = C181589Rb.A00(A022, (String) null, (String) null, AnonymousClass11P.A01(r2));
                            } else {
                                C18070vi.A11("time");
                                throw null;
                            }
                        }
                    }
                    Intent A0D = C108995ce.A0D(galleryTabHostFragment);
                    long j = 0;
                    if (A0D != null && A0D.hasExtra("picker_open_time")) {
                        j = A0D.getLongExtra("picker_open_time", 0);
                    }
                    Intent A0D2 = C108995ce.A0D(galleryTabHostFragment);
                    boolean z2 = false;
                    if (A0D2 != null && A0D2.hasExtra("number_from_url")) {
                        z2 = A0D2.getBooleanExtra("number_from_url", false);
                    }
                    int A023 = GalleryTabHostFragment.A02(galleryTabHostFragment);
                    AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
                    if (A1B == null || (intent = A1B.getIntent()) == null || !intent.hasExtra("send")) {
                        z = true;
                    } else {
                        z = intent.getBooleanExtra("send", true);
                    }
                    AnonymousClass00H r22 = galleryTabHostFragment.A0S;
                    if (r22 != null) {
                        Map map = ((C57382iz) ((C134146q7) r22.get()).A0A.get()).A00;
                        HashSet A12 = C17880vN.A12();
                        boolean A1T = AnonymousClass000.A1T(C108945cZ.A0l(galleryTabHostFragment.A10).A0T(), 3);
                        if (galleryTabHostFragment.A0A != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - galleryTabHostFragment.A00;
                            LinkedHashMap A13 = C17880vN.A13();
                            Integer valueOf = Integer.valueOf(MediaQualityViewModel.A00(galleryTabHostFragment));
                            HashSet A0n = C29431cG.A0n(list);
                            if (galleryTabHostFragment.A0A != null) {
                                Long valueOf2 = Long.valueOf(System.nanoTime());
                                Long A0L = C17890vO.A0L();
                                boolean A0r = GalleryTabHostFragment.A0r(galleryTabHostFragment, "apply_rotation_on_not_send");
                                AnonymousClass1K1 r23 = r4.A00.A00;
                                AnonymousClass73D r18 = r11;
                                C121956Md r13 = new C121956Md(r23.AAO, (AnonymousClass77N) null, (AnonymousClass709) null, (AnonymousClass709) null, r18, (C135306rz) null, galleryTabHostFragment, (AnonymousClass87V) null, r1, (C136246tV) null, false, valueOf, valueOf2, A0L, A0L, (String) null, set, A12, A0n, A0M, list, map, A13, A023, j, elapsedRealtime, z2, z, A1T, true, false, false, false, A0r);
                                AnonymousClass1K1.A6v(r23, r13);
                                AnonymousClass3MW.A1T(r13, r8, 0);
                                return;
                            }
                        }
                        str = "time";
                    } else {
                        str = "optimisticUploadController";
                    }
                } else {
                    str = "prepareAndSendMediaTaskFactory";
                }
            } else {
                str = "waWorkers";
            }
            C18070vi.A11(str);
            throw null;
        }
        C115095tO r7 = (C115095tO) this.A01;
        AbstractCollection abstractCollection = (AbstractCollection) this.A02;
        Intent intent2 = (Intent) this.A03;
        int size = abstractCollection.size();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            r7.A0Z.A0l(C108945cZ.A0M(it), r7.A08, new AnonymousClass7N7(intent2, r7, size));
            r7.A0I.BCm();
        }
    }
}
