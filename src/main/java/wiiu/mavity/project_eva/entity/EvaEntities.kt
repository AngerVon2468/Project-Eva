package wiiu.mavity.project_eva.entity

import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder

import net.minecraft.entity.*
import net.minecraft.registry.*
import net.minecraft.util.Identifier

import wiiu.mavity.project_eva.ProjectEva
import wiiu.mavity.project_eva.entity.custom.ATFieldEntity

object EvaEntities {

    init {
        ProjectEva.LOGGER.info("Registering Entities for Project Eva!")
    }

    internal val AT_FIELD_ID = Identifier(ProjectEva.MOD_ID, "at_field")

    val AT_FIELD: EntityType<ATFieldEntity> = Registry.register(Registries.ENTITY_TYPE, AT_FIELD_ID,
        FabricEntityTypeBuilder.create(SpawnGroup.MISC, ::ATFieldEntity)
            .dimensions(EntityDimensions.fixed(0.1f, 3.0f))
            .fireImmune()
            .trackRangeBlocks(5000)
            .spawnableFarFromPlayer()
            .build()
    )
}