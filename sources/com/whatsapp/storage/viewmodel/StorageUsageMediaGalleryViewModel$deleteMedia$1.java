package com.whatsapp.storage.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass3MZ;
import X.AnonymousClass7H2;
import X.AnonymousClass7H7;
import X.C145727Mj;
import X.C145737Mk;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel$deleteMedia$1", f = "StorageUsageMediaGalleryViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class StorageUsageMediaGalleryViewModel$deleteMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isMediaCached;
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ AnonymousClass7H7 $mediaGalleryList;
    public final /* synthetic */ Collection $messages;
    public int label;
    public final /* synthetic */ StorageUsageMediaGalleryViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel$deleteMedia$1$1", f = "StorageUsageMediaGalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel$deleteMedia$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            StorageUsageMediaGalleryViewModel storageUsageMediaGalleryViewModel = storageUsageMediaGalleryViewModel;
            Collection collection = collection;
            return new AnonymousClass1(r4, r5, storageUsageMediaGalleryViewModel, collection, r9, z);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                StorageUsageMediaGalleryViewModel storageUsageMediaGalleryViewModel = storageUsageMediaGalleryViewModel;
                Collection collection = collection;
                AnonymousClass1BI r9 = r5;
                AnonymousClass7H7 r8 = r4;
                boolean z = z;
                try {
                    Iterator it = collection.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnonymousClass205 A10 = AnonymousClass3MZ.A10(it);
                        AnonymousClass1BI r0 = A10.A00;
                        if (r9 == null || C18070vi.A18(r0, r9)) {
                            if (!z) {
                                storageUsageMediaGalleryViewModel.A00.A0E(C145737Mk.A00);
                                break;
                            } else if (r8 != null) {
                                int count = r8.getCount();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= count) {
                                        break;
                                    }
                                    Map map = r8.A05;
                                    AnonymousClass7H2 r1 = (AnonymousClass7H2) AnonymousClass000.A0w(map, i2);
                                    if (r1 == null || r1.A01 == null || !r1.A01.A0v.equals(A10)) {
                                        i2++;
                                    } else {
                                        map.remove(Integer.valueOf(i2));
                                        r8.A00++;
                                        while (i2 < count - 1) {
                                            Integer valueOf = Integer.valueOf(i2);
                                            i2++;
                                            map.put(valueOf, map.remove(Integer.valueOf(i2)));
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                    if (i > 0) {
                        storageUsageMediaGalleryViewModel.A00.A0E(new C145727Mj(-i));
                    }
                } catch (CancellationException e) {
                    Log.e("StorageUsageMediaGalleryViewState/deleteMediaInternal/e", e);
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageUsageMediaGalleryViewModel$deleteMedia$1(AnonymousClass7H7 r2, AnonymousClass1BI r3, StorageUsageMediaGalleryViewModel storageUsageMediaGalleryViewModel, Collection collection, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = storageUsageMediaGalleryViewModel;
        this.$messages = collection;
        this.$jid = r3;
        this.$mediaGalleryList = r2;
        this.$isMediaCached = z;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        StorageUsageMediaGalleryViewModel storageUsageMediaGalleryViewModel = this.this$0;
        Collection collection = this.$messages;
        return new StorageUsageMediaGalleryViewModel$deleteMedia$1(this.$mediaGalleryList, this.$jid, storageUsageMediaGalleryViewModel, collection, r9, this.$isMediaCached);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StorageUsageMediaGalleryViewModel storageUsageMediaGalleryViewModel = this.this$0;
            C18600wl r0 = storageUsageMediaGalleryViewModel.A01;
            final Collection collection = this.$messages;
            final AnonymousClass1BI r5 = this.$jid;
            final AnonymousClass7H7 r4 = this.$mediaGalleryList;
            final boolean z = this.$isMediaCached;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StorageUsageMediaGalleryViewModel$deleteMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
