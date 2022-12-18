package com.diego4458.enderfeatures.mixin;


import com.diego4458.enderfeatures.item.custom.ModAxe;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DamageEnchantment.class)
public class SharpnessMixin {
    @Inject(at = @At("HEAD"), method = "isAcceptableItem",cancellable = true)
    public void isAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> response) {
        if (stack.getItem() instanceof ModAxe) {
            response.setReturnValue(true);
        }
    }
}
