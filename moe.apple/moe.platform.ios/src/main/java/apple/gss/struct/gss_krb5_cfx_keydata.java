/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.gss.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class gss_krb5_cfx_keydata extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public gss_krb5_cfx_keydata() {
        super(gss_krb5_cfx_keydata.class);
    }

    @Generated
    protected gss_krb5_cfx_keydata(Pointer peer) {
        super(peer);
    }

    @Generated
    public gss_krb5_cfx_keydata(int have_acceptor_subkey, @ByValue gss_krb5_lucid_key ctx_key,
            @ByValue gss_krb5_lucid_key acceptor_subkey) {
        super(gss_krb5_cfx_keydata.class);
        setHave_acceptor_subkey(have_acceptor_subkey);
        setCtx_key(ctx_key);
        setAcceptor_subkey(acceptor_subkey);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int have_acceptor_subkey();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHave_acceptor_subkey(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native gss_krb5_lucid_key ctx_key();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCtx_key(@ByValue gss_krb5_lucid_key value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native gss_krb5_lucid_key acceptor_subkey();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAcceptor_subkey(@ByValue gss_krb5_lucid_key value);
}
