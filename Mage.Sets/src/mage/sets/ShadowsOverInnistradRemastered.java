package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * https://scryfall.com/sets/sir
 *
 * @author JayDi85
 */
public class ShadowsOverInnistradRemastered extends ExpansionSet {

    private static final ShadowsOverInnistradRemastered instance = new ShadowsOverInnistradRemastered();

    public static ShadowsOverInnistradRemastered getInstance() {
        return instance;
    }

    private ShadowsOverInnistradRemastered() {
        super("Shadows over Innistrad Remastered", "SIR", ExpansionSet.buildDate(2023, 3, 21), SetType.MAGIC_ARENA);
        this.enableArenaBooster(Integer.MAX_VALUE);
        this.numBoosterDoubleFaced = -1;

        // TODO: implement special slot with x1 card from SIS - Shadows of the Past
        //  https://mtg.fandom.com/wiki/Shadows_over_Innistrad_Remastered/Shadows_of_the_Past

        cards.add(new SetCardInfo("Abolisher of Bloodlines", 138, Rarity.RARE, mage.cards.a.AbolisherOfBloodlines.class));
        cards.add(new SetCardInfo("Abundant Maw", 1, Rarity.UNCOMMON, mage.cards.a.AbundantMaw.class));
        cards.add(new SetCardInfo("Accursed Witch", 97, Rarity.UNCOMMON, mage.cards.a.AccursedWitch.class));
        cards.add(new SetCardInfo("Advanced Stitchwing", 54, Rarity.UNCOMMON, mage.cards.a.AdvancedStitchwing.class));
        cards.add(new SetCardInfo("Aim High", 185, Rarity.COMMON, mage.cards.a.AimHigh.class));
        cards.add(new SetCardInfo("Alchemist's Greeting", 140, Rarity.COMMON, mage.cards.a.AlchemistsGreeting.class));
        cards.add(new SetCardInfo("Alms of the Vein", 98, Rarity.COMMON, mage.cards.a.AlmsOfTheVein.class));
        cards.add(new SetCardInfo("Altered Ego", 228, Rarity.RARE, mage.cards.a.AlteredEgo.class));
        cards.add(new SetCardInfo("Always Watching", 10, Rarity.RARE, mage.cards.a.AlwaysWatching.class));
        cards.add(new SetCardInfo("Angelic Purge", 11, Rarity.COMMON, mage.cards.a.AngelicPurge.class));
        cards.add(new SetCardInfo("Anguished Unmaking", 229, Rarity.UNCOMMON, mage.cards.a.AnguishedUnmaking.class));
        cards.add(new SetCardInfo("Apothecary Geist", 12, Rarity.COMMON, mage.cards.a.ApothecaryGeist.class));
        cards.add(new SetCardInfo("Archangel Avacyn", 13, Rarity.MYTHIC, mage.cards.a.ArchangelAvacyn.class));
        cards.add(new SetCardInfo("Arlinn Kord", 230, Rarity.MYTHIC, mage.cards.a.ArlinnKord.class));
        cards.add(new SetCardInfo("Arlinn, Embraced by the Moon", 230, Rarity.MYTHIC, mage.cards.a.ArlinnEmbracedByTheMoon.class));
        cards.add(new SetCardInfo("Ashmouth Blade", 256, Rarity.UNCOMMON, mage.cards.a.AshmouthBlade.class));
        cards.add(new SetCardInfo("Assembled Alphas", 141, Rarity.RARE, mage.cards.a.AssembledAlphas.class));
        cards.add(new SetCardInfo("Aurora of Emrakul", 248, Rarity.UNCOMMON, mage.cards.a.AuroraOfEmrakul.class));
        cards.add(new SetCardInfo("Avacyn's Judgment", 142, Rarity.RARE, mage.cards.a.AvacynsJudgment.class));
        cards.add(new SetCardInfo("Avacyn, the Purifier", 13, Rarity.MYTHIC, mage.cards.a.AvacynThePurifier.class));
        cards.add(new SetCardInfo("Awoken Horror", 95, Rarity.RARE, mage.cards.a.AwokenHorror.class));
        cards.add(new SetCardInfo("Bearer of Overwhelming Truths", 59, Rarity.UNCOMMON, mage.cards.b.BearerOfOverwhelmingTruths.class));
        cards.add(new SetCardInfo("Bedlam Reveler", 143, Rarity.RARE, mage.cards.b.BedlamReveler.class));
        cards.add(new SetCardInfo("Biting Rain", 99, Rarity.UNCOMMON, mage.cards.b.BitingRain.class));
        cards.add(new SetCardInfo("Blessed Alliance", 14, Rarity.UNCOMMON, mage.cards.b.BlessedAlliance.class));
        cards.add(new SetCardInfo("Blood Mist", 144, Rarity.UNCOMMON, mage.cards.b.BloodMist.class));
        cards.add(new SetCardInfo("Bloodbriar", 186, Rarity.COMMON, mage.cards.b.Bloodbriar.class));
        cards.add(new SetCardInfo("Bloodhall Priest", 231, Rarity.RARE, mage.cards.b.BloodhallPriest.class));
        cards.add(new SetCardInfo("Bloodmad Vampire", 145, Rarity.COMMON, mage.cards.b.BloodmadVampire.class));
        cards.add(new SetCardInfo("Borrowed Grace", 15, Rarity.COMMON, mage.cards.b.BorrowedGrace.class));
        cards.add(new SetCardInfo("Borrowed Hostility", 146, Rarity.COMMON, mage.cards.b.BorrowedHostility.class));
        cards.add(new SetCardInfo("Borrowed Malevolence", 100, Rarity.COMMON, mage.cards.b.BorrowedMalevolence.class));
        cards.add(new SetCardInfo("Bound by Moonsilver", 16, Rarity.COMMON, mage.cards.b.BoundByMoonsilver.class));
        cards.add(new SetCardInfo("Brain in a Jar", 247, Rarity.UNCOMMON, mage.cards.b.BrainInAJar.class));
        cards.add(new SetCardInfo("Briarbridge Patrol", 187, Rarity.COMMON, mage.cards.b.BriarbridgePatrol.class));
        cards.add(new SetCardInfo("Brisela, Voice of Nightmares", "17b", Rarity.MYTHIC, mage.cards.b.BriselaVoiceOfNightmares.class));
        cards.add(new SetCardInfo("Bruna, the Fading Light", "17a", Rarity.RARE, mage.cards.b.BrunaTheFadingLight.class));
        cards.add(new SetCardInfo("Burn from Within", 147, Rarity.RARE, mage.cards.b.BurnFromWithin.class));
        cards.add(new SetCardInfo("Bygone Bishop", 18, Rarity.RARE, mage.cards.b.BygoneBishop.class));
        cards.add(new SetCardInfo("Byway Courier", 188, Rarity.COMMON, mage.cards.b.BywayCourier.class));
        cards.add(new SetCardInfo("Call the Bloodline", 101, Rarity.UNCOMMON, mage.cards.c.CallTheBloodline.class));
        cards.add(new SetCardInfo("Certain Death", 102, Rarity.COMMON, mage.cards.c.CertainDeath.class));
        cards.add(new SetCardInfo("Chittering Host", "115b", Rarity.COMMON, mage.cards.c.ChitteringHost.class));
        cards.add(new SetCardInfo("Choked Estuary", 264, Rarity.UNCOMMON, mage.cards.c.ChokedEstuary.class));
        cards.add(new SetCardInfo("Clear Shot", 189, Rarity.UNCOMMON, mage.cards.c.ClearShot.class));
        cards.add(new SetCardInfo("Collective Brutality", 103, Rarity.RARE, mage.cards.c.CollectiveBrutality.class));
        cards.add(new SetCardInfo("Collective Defiance", 148, Rarity.RARE, mage.cards.c.CollectiveDefiance.class));
        cards.add(new SetCardInfo("Collective Effort", 19, Rarity.RARE, mage.cards.c.CollectiveEffort.class));
        cards.add(new SetCardInfo("Compelling Deterrence", 55, Rarity.UNCOMMON, mage.cards.c.CompellingDeterrence.class));
        cards.add(new SetCardInfo("Conduit of Emrakul", 149, Rarity.COMMON, mage.cards.c.ConduitOfEmrakul.class));
        cards.add(new SetCardInfo("Conduit of Storms", 149, Rarity.COMMON, mage.cards.c.ConduitOfStorms.class));
        cards.add(new SetCardInfo("Confirm Suspicions", 56, Rarity.RARE, mage.cards.c.ConfirmSuspicions.class));
        cards.add(new SetCardInfo("Confront the Unknown", 190, Rarity.COMMON, mage.cards.c.ConfrontTheUnknown.class));
        cards.add(new SetCardInfo("Convolute", 57, Rarity.COMMON, mage.cards.c.Convolute.class));
        cards.add(new SetCardInfo("Courageous Outrider", 20, Rarity.UNCOMMON, mage.cards.c.CourageousOutrider.class));
        cards.add(new SetCardInfo("Crawling Sensation", 191, Rarity.UNCOMMON, mage.cards.c.CrawlingSensation.class));
        cards.add(new SetCardInfo("Crow of Dark Tidings", 104, Rarity.COMMON, mage.cards.c.CrowOfDarkTidings.class));
        cards.add(new SetCardInfo("Cryptolith Fragment", 248, Rarity.UNCOMMON, mage.cards.c.CryptolithFragment.class));
        cards.add(new SetCardInfo("Cryptolith Rite", 192, Rarity.RARE, mage.cards.c.CryptolithRite.class));
        cards.add(new SetCardInfo("Curious Homunculus", 58, Rarity.UNCOMMON, mage.cards.c.CuriousHomunculus.class));
        cards.add(new SetCardInfo("Daring Sleuth", 59, Rarity.UNCOMMON, mage.cards.d.DaringSleuth.class));
        cards.add(new SetCardInfo("Dark Salvation", 105, Rarity.RARE, mage.cards.d.DarkSalvation.class));
        cards.add(new SetCardInfo("Dauntless Cathar", 21, Rarity.COMMON, mage.cards.d.DauntlessCathar.class));
        cards.add(new SetCardInfo("Dawn Gryff", 22, Rarity.COMMON, mage.cards.d.DawnGryff.class));
        cards.add(new SetCardInfo("Dead Weight", 106, Rarity.COMMON, mage.cards.d.DeadWeight.class));
        cards.add(new SetCardInfo("Deathcap Cultivator", 193, Rarity.UNCOMMON, mage.cards.d.DeathcapCultivator.class));
        cards.add(new SetCardInfo("Decimator of the Provinces", 2, Rarity.MYTHIC, mage.cards.d.DecimatorOfTheProvinces.class));
        cards.add(new SetCardInfo("Declaration in Stone", 23, Rarity.RARE, mage.cards.d.DeclarationInStone.class));
        cards.add(new SetCardInfo("Demon-Possessed Witch", 107, Rarity.UNCOMMON, mage.cards.d.DemonPossessedWitch.class));
        cards.add(new SetCardInfo("Deny Existence", 60, Rarity.COMMON, mage.cards.d.DenyExistence.class));
        cards.add(new SetCardInfo("Deranged Whelp", 150, Rarity.COMMON, mage.cards.d.DerangedWhelp.class));
        cards.add(new SetCardInfo("Descend upon the Sinful", 24, Rarity.MYTHIC, mage.cards.d.DescendUponTheSinful.class));
        cards.add(new SetCardInfo("Devils' Playground", 151, Rarity.RARE, mage.cards.d.DevilsPlayground.class));
        cards.add(new SetCardInfo("Devilthorn Fox", 25, Rarity.COMMON, mage.cards.d.DevilthornFox.class));
        cards.add(new SetCardInfo("Diregraf Colossus", 108, Rarity.RARE, mage.cards.d.DiregrafColossus.class));
        cards.add(new SetCardInfo("Distended Mindbender", 3, Rarity.RARE, mage.cards.d.DistendedMindbender.class));
        cards.add(new SetCardInfo("Docent of Perfection", 61, Rarity.RARE, mage.cards.d.DocentOfPerfection.class));
        cards.add(new SetCardInfo("Drag Under", 62, Rarity.COMMON, mage.cards.d.DragUnder.class));
        cards.add(new SetCardInfo("Drogskol Shieldmate", 26, Rarity.COMMON, mage.cards.d.DrogskolShieldmate.class));
        cards.add(new SetCardInfo("Drownyard Behemoth", 4, Rarity.UNCOMMON, mage.cards.d.DrownyardBehemoth.class));
        cards.add(new SetCardInfo("Drownyard Explorers", 63, Rarity.COMMON, mage.cards.d.DrownyardExplorers.class));
        cards.add(new SetCardInfo("Drunau Corpse Trawler", 64, Rarity.UNCOMMON, mage.cards.d.DrunauCorpseTrawler.class));
        cards.add(new SetCardInfo("Dusk Feaster", 109, Rarity.UNCOMMON, mage.cards.d.DuskFeaster.class));
        cards.add(new SetCardInfo("Duskwatch Recruiter", 194, Rarity.UNCOMMON, mage.cards.d.DuskwatchRecruiter.class));
        cards.add(new SetCardInfo("Elder Deep-Fiend", 5, Rarity.RARE, mage.cards.e.ElderDeepFiend.class));
        cards.add(new SetCardInfo("Eldritch Evolution", 195, Rarity.RARE, mage.cards.e.EldritchEvolution.class));
        cards.add(new SetCardInfo("Ember-Eye Wolf", 152, Rarity.COMMON, mage.cards.e.EmberEyeWolf.class));
        cards.add(new SetCardInfo("Emrakul, the Promised End", 6, Rarity.MYTHIC, mage.cards.e.EmrakulThePromisedEnd.class));
        cards.add(new SetCardInfo("Epiphany at the Drownyard", 65, Rarity.RARE, mage.cards.e.EpiphanyAtTheDrownyard.class));
        cards.add(new SetCardInfo("Epitaph Golem", 249, Rarity.COMMON, mage.cards.e.EpitaphGolem.class));
        cards.add(new SetCardInfo("Erdwal Illuminator", 66, Rarity.UNCOMMON, mage.cards.e.ErdwalIlluminator.class));
        cards.add(new SetCardInfo("Essence Flux", 67, Rarity.COMMON, mage.cards.e.EssenceFlux.class));
        cards.add(new SetCardInfo("Eternal Scourge", 7, Rarity.RARE, mage.cards.e.EternalScourge.class));
        cards.add(new SetCardInfo("Ever After", 110, Rarity.RARE, mage.cards.e.EverAfter.class));
        cards.add(new SetCardInfo("Explosive Apparatus", 250, Rarity.COMMON, mage.cards.e.ExplosiveApparatus.class));
        cards.add(new SetCardInfo("Exultant Cultist", 68, Rarity.COMMON, mage.cards.e.ExultantCultist.class));
        cards.add(new SetCardInfo("Faith Unbroken", 27, Rarity.UNCOMMON, mage.cards.f.FaithUnbroken.class));
        cards.add(new SetCardInfo("Faithbearer Paladin", 28, Rarity.COMMON, mage.cards.f.FaithbearerPaladin.class));
        cards.add(new SetCardInfo("Falkenrath Gorger", 153, Rarity.RARE, mage.cards.f.FalkenrathGorger.class));
        cards.add(new SetCardInfo("Fevered Visions", 232, Rarity.RARE, mage.cards.f.FeveredVisions.class));
        cards.add(new SetCardInfo("Field Creeper", 251, Rarity.COMMON, mage.cards.f.FieldCreeper.class));
        cards.add(new SetCardInfo("Fiend Binder", 29, Rarity.COMMON, mage.cards.f.FiendBinder.class));
        cards.add(new SetCardInfo("Fiery Temper", 154, Rarity.UNCOMMON, mage.cards.f.FieryTemper.class));
        cards.add(new SetCardInfo("Final Iteration", 61, Rarity.RARE, mage.cards.f.FinalIteration.class));
        cards.add(new SetCardInfo("Flameblade Angel", 155, Rarity.RARE, mage.cards.f.FlamebladeAngel.class));
        cards.add(new SetCardInfo("Fleeting Memories", 69, Rarity.UNCOMMON, mage.cards.f.FleetingMemories.class));
        cards.add(new SetCardInfo("Fogwalker", 70, Rarity.COMMON, mage.cards.f.Fogwalker.class));
        cards.add(new SetCardInfo("Foreboding Ruins", 265, Rarity.UNCOMMON, mage.cards.f.ForebodingRuins.class));
        cards.add(new SetCardInfo("Forest", 289, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 290, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 291, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Creation", 71, Rarity.RARE, mage.cards.f.ForgottenCreation.class));
        cards.add(new SetCardInfo("Forsaken Sanctuary", 266, Rarity.UNCOMMON, mage.cards.f.ForsakenSanctuary.class));
        cards.add(new SetCardInfo("Fortified Village", 267, Rarity.UNCOMMON, mage.cards.f.FortifiedVillage.class));
        cards.add(new SetCardInfo("Foul Orchard", 268, Rarity.UNCOMMON, mage.cards.f.FoulOrchard.class));
        cards.add(new SetCardInfo("Furyblade Vampire", 156, Rarity.UNCOMMON, mage.cards.f.FurybladeVampire.class));
        cards.add(new SetCardInfo("Galvanic Bombardment", 157, Rarity.COMMON, mage.cards.g.GalvanicBombardment.class));
        cards.add(new SetCardInfo("Game Trail", 269, Rarity.UNCOMMON, mage.cards.g.GameTrail.class));
        cards.add(new SetCardInfo("Gatstaf Arsonists", 158, Rarity.COMMON, mage.cards.g.GatstafArsonists.class));
        cards.add(new SetCardInfo("Gatstaf Ravagers", 158, Rarity.COMMON, mage.cards.g.GatstafRavagers.class));
        cards.add(new SetCardInfo("Gavony Unhallowed", 111, Rarity.COMMON, mage.cards.g.GavonyUnhallowed.class));
        cards.add(new SetCardInfo("Geier Reach Bandit", 159, Rarity.UNCOMMON, mage.cards.g.GeierReachBandit.class));
        cards.add(new SetCardInfo("Geier Reach Sanitarium", 270, Rarity.RARE, mage.cards.g.GeierReachSanitarium.class));
        cards.add(new SetCardInfo("Geist of the Archives", 72, Rarity.COMMON, mage.cards.g.GeistOfTheArchives.class));
        cards.add(new SetCardInfo("Geralf's Masterpiece", 73, Rarity.RARE, mage.cards.g.GeralfsMasterpiece.class));
        cards.add(new SetCardInfo("Ghoulcaller's Accomplice", 112, Rarity.COMMON, mage.cards.g.GhoulcallersAccomplice.class));
        cards.add(new SetCardInfo("Gisa and Geralf", 233, Rarity.MYTHIC, mage.cards.g.GisaAndGeralf.class));
        cards.add(new SetCardInfo("Gisa's Bidding", 113, Rarity.COMMON, mage.cards.g.GisasBidding.class));
        cards.add(new SetCardInfo("Gisela, the Broken Blade", 30, Rarity.MYTHIC, mage.cards.g.GiselaTheBrokenBlade.class));
        cards.add(new SetCardInfo("Gnarlwood Dryad", 196, Rarity.COMMON, mage.cards.g.GnarlwoodDryad.class));
        cards.add(new SetCardInfo("Goldnight Castigator", 160, Rarity.MYTHIC, mage.cards.g.GoldnightCastigator.class));
        cards.add(new SetCardInfo("Graf Harvest", 114, Rarity.UNCOMMON, mage.cards.g.GrafHarvest.class));
        cards.add(new SetCardInfo("Graf Mole", 197, Rarity.UNCOMMON, mage.cards.g.GrafMole.class));
        cards.add(new SetCardInfo("Graf Rats", "115a", Rarity.COMMON, mage.cards.g.GrafRats.class));
        cards.add(new SetCardInfo("Grapple with the Past", 198, Rarity.COMMON, mage.cards.g.GrappleWithThePast.class));
        cards.add(new SetCardInfo("Grim Flayer", 234, Rarity.RARE, mage.cards.g.GrimFlayer.class));
        cards.add(new SetCardInfo("Grotesque Mutation", 116, Rarity.COMMON, mage.cards.g.GrotesqueMutation.class));
        cards.add(new SetCardInfo("Groundskeeper", 199, Rarity.UNCOMMON, mage.cards.g.Groundskeeper.class));
        cards.add(new SetCardInfo("Gryff's Boon", 31, Rarity.UNCOMMON, mage.cards.g.GryffsBoon.class));
        cards.add(new SetCardInfo("Guardian of Pilgrims", 32, Rarity.COMMON, mage.cards.g.GuardianOfPilgrims.class));
        cards.add(new SetCardInfo("Hamlet Captain", 200, Rarity.UNCOMMON, mage.cards.h.HamletCaptain.class));
        cards.add(new SetCardInfo("Hanweir Battlements", 271, Rarity.RARE, mage.cards.h.HanweirBattlements.class));
        cards.add(new SetCardInfo("Hanweir Garrison", "161a", Rarity.RARE, mage.cards.h.HanweirGarrison.class));
        cards.add(new SetCardInfo("Hanweir, the Writhing Township", "161b", Rarity.RARE, mage.cards.h.HanweirTheWrithingTownship.class));
        cards.add(new SetCardInfo("Harvest Hand", 252, Rarity.UNCOMMON, mage.cards.h.HarvestHand.class));
        cards.add(new SetCardInfo("Haunted Dead", 117, Rarity.UNCOMMON, mage.cards.h.HauntedDead.class));
        cards.add(new SetCardInfo("Heron's Grace Champion", 235, Rarity.RARE, mage.cards.h.HeronsGraceChampion.class));
        cards.add(new SetCardInfo("Highland Lake", 272, Rarity.UNCOMMON, mage.cards.h.HighlandLake.class));
        cards.add(new SetCardInfo("Hinterland Logger", 201, Rarity.COMMON, mage.cards.h.HinterlandLogger.class));
        cards.add(new SetCardInfo("Hope Against Hope", 33, Rarity.UNCOMMON, mage.cards.h.HopeAgainstHope.class));
        cards.add(new SetCardInfo("Howling Chorus", 214, Rarity.UNCOMMON, mage.cards.h.HowlingChorus.class));
        cards.add(new SetCardInfo("Howlpack Resurgence", 202, Rarity.UNCOMMON, mage.cards.h.HowlpackResurgence.class));
        cards.add(new SetCardInfo("Howlpack Wolf", 162, Rarity.COMMON, mage.cards.h.HowlpackWolf.class));
        cards.add(new SetCardInfo("Humble the Brute", 34, Rarity.UNCOMMON, mage.cards.h.HumbleTheBrute.class));
        cards.add(new SetCardInfo("Imprisoned in the Moon", 74, Rarity.COMMON, mage.cards.i.ImprisonedInTheMoon.class));
        cards.add(new SetCardInfo("Incendiary Flow", 163, Rarity.COMMON, mage.cards.i.IncendiaryFlow.class));
        cards.add(new SetCardInfo("Incited Rabble", 53, Rarity.UNCOMMON, mage.cards.i.IncitedRabble.class));
        cards.add(new SetCardInfo("Indulgent Aristocrat", 118, Rarity.UNCOMMON, mage.cards.i.IndulgentAristocrat.class));
        cards.add(new SetCardInfo("Infectious Curse", 97, Rarity.UNCOMMON, mage.cards.i.InfectiousCurse.class));
        cards.add(new SetCardInfo("Ingenious Skaab", 75, Rarity.COMMON, mage.cards.i.IngeniousSkaab.class));
        cards.add(new SetCardInfo("Insatiable Gorgers", 164, Rarity.COMMON, mage.cards.i.InsatiableGorgers.class));
        cards.add(new SetCardInfo("Insolent Neonate", 165, Rarity.COMMON, mage.cards.i.InsolentNeonate.class));
        cards.add(new SetCardInfo("Intrepid Provisioner", 203, Rarity.COMMON, mage.cards.i.IntrepidProvisioner.class));
        cards.add(new SetCardInfo("Invasive Surgery", 76, Rarity.UNCOMMON, mage.cards.i.InvasiveSurgery.class));
        cards.add(new SetCardInfo("Ironclad Slayer", 35, Rarity.UNCOMMON, mage.cards.i.IroncladSlayer.class));
        cards.add(new SetCardInfo("Ishkanah, Grafwidow", 204, Rarity.MYTHIC, mage.cards.i.IshkanahGrafwidow.class));
        cards.add(new SetCardInfo("Island", 280, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 281, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 282, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("It That Rides as One", 36, Rarity.UNCOMMON, mage.cards.i.ItThatRidesAsOne.class));
        cards.add(new SetCardInfo("Jace's Scrutiny", 78, Rarity.COMMON, mage.cards.j.JacesScrutiny.class));
        cards.add(new SetCardInfo("Jace, Unraveler of Secrets", 77, Rarity.MYTHIC, mage.cards.j.JaceUnravelerOfSecrets.class));
        cards.add(new SetCardInfo("Kindly Stranger", 107, Rarity.UNCOMMON, mage.cards.k.KindlyStranger.class));
        cards.add(new SetCardInfo("Krallenhorde Howler", 194, Rarity.UNCOMMON, mage.cards.k.KrallenhordeHowler.class));
        cards.add(new SetCardInfo("Laboratory Brute", 79, Rarity.COMMON, mage.cards.l.LaboratoryBrute.class));
        cards.add(new SetCardInfo("Lightning Axe", 166, Rarity.UNCOMMON, mage.cards.l.LightningAxe.class));
        cards.add(new SetCardInfo("Liliana's Elite", 120, Rarity.COMMON, mage.cards.l.LilianasElite.class));
        cards.add(new SetCardInfo("Liliana, the Last Hope", 119, Rarity.MYTHIC, mage.cards.l.LilianaTheLastHope.class));
        cards.add(new SetCardInfo("Lone Rider", 36, Rarity.UNCOMMON, mage.cards.l.LoneRider.class));
        cards.add(new SetCardInfo("Lunarch Mantle", 37, Rarity.COMMON, mage.cards.l.LunarchMantle.class));
        cards.add(new SetCardInfo("Lupine Prototype", 253, Rarity.UNCOMMON, mage.cards.l.LupinePrototype.class));
        cards.add(new SetCardInfo("Macabre Waltz", 121, Rarity.COMMON, mage.cards.m.MacabreWaltz.class));
        cards.add(new SetCardInfo("Mad Prophet", 167, Rarity.UNCOMMON, mage.cards.m.MadProphet.class));
        cards.add(new SetCardInfo("Magmatic Chasm", 168, Rarity.COMMON, mage.cards.m.MagmaticChasm.class));
        cards.add(new SetCardInfo("Magnifying Glass", 254, Rarity.COMMON, mage.cards.m.MagnifyingGlass.class));
        cards.add(new SetCardInfo("Make Mischief", 169, Rarity.COMMON, mage.cards.m.MakeMischief.class));
        cards.add(new SetCardInfo("Manic Scribe", 80, Rarity.UNCOMMON, mage.cards.m.ManicScribe.class));
        cards.add(new SetCardInfo("Mausoleum Wanderer", 81, Rarity.RARE, mage.cards.m.MausoleumWanderer.class));
        cards.add(new SetCardInfo("Merciless Resolve", 122, Rarity.COMMON, mage.cards.m.MercilessResolve.class));
        cards.add(new SetCardInfo("Mercurial Geists", 236, Rarity.UNCOMMON, mage.cards.m.MercurialGeists.class));
        cards.add(new SetCardInfo("Midnight Scavengers", 123, Rarity.UNCOMMON, mage.cards.m.MidnightScavengers.class));
        cards.add(new SetCardInfo("Mind's Dilation", 82, Rarity.MYTHIC, mage.cards.m.MindsDilation.class));
        cards.add(new SetCardInfo("Mindwrack Demon", 124, Rarity.MYTHIC, mage.cards.m.MindwrackDemon.class));
        cards.add(new SetCardInfo("Mirrorwing Dragon", 170, Rarity.MYTHIC, mage.cards.m.MirrorwingDragon.class));
        cards.add(new SetCardInfo("Mockery of Nature", 8, Rarity.UNCOMMON, mage.cards.m.MockeryOfNature.class));
        cards.add(new SetCardInfo("Moonlight Hunt", 205, Rarity.COMMON, mage.cards.m.MoonlightHunt.class));
        cards.add(new SetCardInfo("Moonrise Intruder", 184, Rarity.UNCOMMON, mage.cards.m.MoonriseIntruder.class));
        cards.add(new SetCardInfo("Morkrut Necropod", 125, Rarity.COMMON, mage.cards.m.MorkrutNecropod.class));
        cards.add(new SetCardInfo("Mountain", 286, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 287, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 288, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mournwillow", 237, Rarity.UNCOMMON, mage.cards.m.Mournwillow.class));
        cards.add(new SetCardInfo("Murderer's Axe", 255, Rarity.UNCOMMON, mage.cards.m.MurderersAxe.class));
        cards.add(new SetCardInfo("Nahiri's Wrath", 171, Rarity.MYTHIC, mage.cards.n.NahirisWrath.class));
        cards.add(new SetCardInfo("Nahiri, the Harbinger", 238, Rarity.MYTHIC, mage.cards.n.NahiriTheHarbinger.class));
        cards.add(new SetCardInfo("Nearheath Chaplain", 38, Rarity.UNCOMMON, mage.cards.n.NearheathChaplain.class));
        cards.add(new SetCardInfo("Nebelgast Herald", 83, Rarity.UNCOMMON, mage.cards.n.NebelgastHerald.class));
        cards.add(new SetCardInfo("Neglected Heirloom", 256, Rarity.UNCOMMON, mage.cards.n.NeglectedHeirloom.class));
        cards.add(new SetCardInfo("Noose Constrictor", 206, Rarity.UNCOMMON, mage.cards.n.NooseConstrictor.class));
        cards.add(new SetCardInfo("Noosegraf Mob", 126, Rarity.RARE, mage.cards.n.NoosegrafMob.class));
        cards.add(new SetCardInfo("Obsessive Skinner", 207, Rarity.COMMON, mage.cards.o.ObsessiveSkinner.class));
        cards.add(new SetCardInfo("Odric, Lunarch Marshal", 39, Rarity.RARE, mage.cards.o.OdricLunarchMarshal.class));
        cards.add(new SetCardInfo("Olivia's Bloodsworn", 127, Rarity.UNCOMMON, mage.cards.o.OliviasBloodsworn.class));
        cards.add(new SetCardInfo("Olivia's Dragoon", 128, Rarity.COMMON, mage.cards.o.OliviasDragoon.class));
        cards.add(new SetCardInfo("Olivia, Mobilized for War", 239, Rarity.MYTHIC, mage.cards.o.OliviaMobilizedForWar.class));
        cards.add(new SetCardInfo("Ongoing Investigation", 84, Rarity.UNCOMMON, mage.cards.o.OngoingInvestigation.class));
        cards.add(new SetCardInfo("Ormendahl, Profane Prince", 275, Rarity.RARE, mage.cards.o.OrmendahlProfanePrince.class));
        cards.add(new SetCardInfo("Pack Guardian", 208, Rarity.UNCOMMON, mage.cards.p.PackGuardian.class));
        cards.add(new SetCardInfo("Permeating Mass", 209, Rarity.RARE, mage.cards.p.PermeatingMass.class));
        cards.add(new SetCardInfo("Persistent Nightmare", 90, Rarity.MYTHIC, mage.cards.p.PersistentNightmare.class));
        cards.add(new SetCardInfo("Pick the Brain", 129, Rarity.UNCOMMON, mage.cards.p.PickTheBrain.class));
        cards.add(new SetCardInfo("Pieces of the Puzzle", 85, Rarity.UNCOMMON, mage.cards.p.PiecesOfThePuzzle.class));
        cards.add(new SetCardInfo("Plains", 277, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 278, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 279, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pore Over the Pages", 86, Rarity.UNCOMMON, mage.cards.p.PoreOverThePages.class));
        cards.add(new SetCardInfo("Port Town", 273, Rarity.UNCOMMON, mage.cards.p.PortTown.class));
        cards.add(new SetCardInfo("Prized Amalgam", 240, Rarity.RARE, mage.cards.p.PrizedAmalgam.class));
        cards.add(new SetCardInfo("Puncturing Light", 40, Rarity.COMMON, mage.cards.p.PuncturingLight.class));
        cards.add(new SetCardInfo("Pyre Hound", 172, Rarity.COMMON, mage.cards.p.PyreHound.class));
        cards.add(new SetCardInfo("Rabid Bite", 210, Rarity.COMMON, mage.cards.r.RabidBite.class));
        cards.add(new SetCardInfo("Rattlechains", 87, Rarity.RARE, mage.cards.r.Rattlechains.class));
        cards.add(new SetCardInfo("Ravenous Bloodseeker", 173, Rarity.COMMON, mage.cards.r.RavenousBloodseeker.class));
        cards.add(new SetCardInfo("Reaper of Flight Moonsilver", 41, Rarity.UNCOMMON, mage.cards.r.ReaperOfFlightMoonsilver.class));
        cards.add(new SetCardInfo("Relentless Dead", 130, Rarity.MYTHIC, mage.cards.r.RelentlessDead.class));
        cards.add(new SetCardInfo("Ride Down", 241, Rarity.UNCOMMON, mage.cards.r.RideDown.class));
        cards.add(new SetCardInfo("Rise from the Grave", 131, Rarity.UNCOMMON, mage.cards.r.RiseFromTheGrave.class));
        cards.add(new SetCardInfo("Rise from the Tides", 88, Rarity.UNCOMMON, mage.cards.r.RiseFromTheTides.class));
        cards.add(new SetCardInfo("Rush of Adrenaline", 174, Rarity.COMMON, mage.cards.r.RushOfAdrenaline.class));
        cards.add(new SetCardInfo("Ruthless Disposal", 132, Rarity.UNCOMMON, mage.cards.r.RuthlessDisposal.class));
        cards.add(new SetCardInfo("Sage of Ancient Lore", 211, Rarity.RARE, mage.cards.s.SageOfAncientLore.class));
        cards.add(new SetCardInfo("Sanitarium Skeleton", 133, Rarity.COMMON, mage.cards.s.SanitariumSkeleton.class));
        cards.add(new SetCardInfo("Scourge Wolf", 175, Rarity.UNCOMMON, mage.cards.s.ScourgeWolf.class));
        cards.add(new SetCardInfo("Scrounged Scythe", 252, Rarity.UNCOMMON, mage.cards.s.ScroungedScythe.class));
        cards.add(new SetCardInfo("Seasons Past", 212, Rarity.MYTHIC, mage.cards.s.SeasonsPast.class));
        cards.add(new SetCardInfo("Second Harvest", 213, Rarity.RARE, mage.cards.s.SecondHarvest.class));
        cards.add(new SetCardInfo("Selfless Spirit", 42, Rarity.RARE, mage.cards.s.SelflessSpirit.class));
        cards.add(new SetCardInfo("Shreds of Sanity", 176, Rarity.UNCOMMON, mage.cards.s.ShredsOfSanity.class));
        cards.add(new SetCardInfo("Shrill Howler", 214, Rarity.UNCOMMON, mage.cards.s.ShrillHowler.class));
        cards.add(new SetCardInfo("Sigarda's Aid", 43, Rarity.RARE, mage.cards.s.SigardasAid.class));
        cards.add(new SetCardInfo("Sigarda, Heron's Grace", 242, Rarity.MYTHIC, mage.cards.s.SigardaHeronsGrace.class));
        cards.add(new SetCardInfo("Sigardian Priest", 44, Rarity.COMMON, mage.cards.s.SigardianPriest.class));
        cards.add(new SetCardInfo("Sin Prodder", 177, Rarity.RARE, mage.cards.s.SinProdder.class));
        cards.add(new SetCardInfo("Slayer's Plate", 257, Rarity.RARE, mage.cards.s.SlayersPlate.class));
        cards.add(new SetCardInfo("Sorin, Grim Nemesis", 243, Rarity.MYTHIC, mage.cards.s.SorinGrimNemesis.class));
        cards.add(new SetCardInfo("Soul Separator", 258, Rarity.UNCOMMON, mage.cards.s.SoulSeparator.class));
        cards.add(new SetCardInfo("Spectral Shepherd", 45, Rarity.UNCOMMON, mage.cards.s.SpectralShepherd.class));
        cards.add(new SetCardInfo("Spell Queller", 244, Rarity.RARE, mage.cards.s.SpellQueller.class));
        cards.add(new SetCardInfo("Spirit of the Hunt", 215, Rarity.RARE, mage.cards.s.SpiritOfTheHunt.class));
        cards.add(new SetCardInfo("Splendid Reclamation", 216, Rarity.RARE, mage.cards.s.SplendidReclamation.class));
        cards.add(new SetCardInfo("Spontaneous Mutation", 89, Rarity.COMMON, mage.cards.s.SpontaneousMutation.class));
        cards.add(new SetCardInfo("Startled Awake", 90, Rarity.MYTHIC, mage.cards.s.StartledAwake.class));
        cards.add(new SetCardInfo("Steadfast Cathar", 46, Rarity.COMMON, mage.cards.s.SteadfastCathar.class));
        cards.add(new SetCardInfo("Stensia Masquerade", 178, Rarity.UNCOMMON, mage.cards.s.StensiaMasquerade.class));
        cards.add(new SetCardInfo("Stitcher's Graft", 259, Rarity.RARE, mage.cards.s.StitchersGraft.class));
        cards.add(new SetCardInfo("Stone Quarry", 274, Rarity.UNCOMMON, mage.cards.s.StoneQuarry.class));
        cards.add(new SetCardInfo("Stormrider Spirit", 91, Rarity.COMMON, mage.cards.s.StormriderSpirit.class));
        cards.add(new SetCardInfo("Strength of Arms", 47, Rarity.COMMON, mage.cards.s.StrengthOfArms.class));
        cards.add(new SetCardInfo("Stromkirk Condemned", 134, Rarity.RARE, mage.cards.s.StromkirkCondemned.class));
        cards.add(new SetCardInfo("Stromkirk Occultist", 179, Rarity.UNCOMMON, mage.cards.s.StromkirkOccultist.class));
        cards.add(new SetCardInfo("Subjugator Angel", 48, Rarity.UNCOMMON, mage.cards.s.SubjugatorAngel.class));
        cards.add(new SetCardInfo("Summary Dismissal", 92, Rarity.RARE, mage.cards.s.SummaryDismissal.class));
        cards.add(new SetCardInfo("Swamp", 283, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 284, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 285, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swift Spinner", 217, Rarity.COMMON, mage.cards.s.SwiftSpinner.class));
        cards.add(new SetCardInfo("Take Inventory", 93, Rarity.COMMON, mage.cards.t.TakeInventory.class));
        cards.add(new SetCardInfo("Tamiyo's Journal", 260, Rarity.RARE, mage.cards.t.TamiyosJournal.class));
        cards.add(new SetCardInfo("Tamiyo, Field Researcher", 245, Rarity.MYTHIC, mage.cards.t.TamiyoFieldResearcher.class));
        cards.add(new SetCardInfo("Tattered Haunter", 94, Rarity.COMMON, mage.cards.t.TatteredHaunter.class));
        cards.add(new SetCardInfo("Terrarion", 261, Rarity.COMMON, mage.cards.t.Terrarion.class));
        cards.add(new SetCardInfo("Thalia's Lancers", 50, Rarity.RARE, mage.cards.t.ThaliasLancers.class));
        cards.add(new SetCardInfo("Thalia, Heretic Cathar", 49, Rarity.RARE, mage.cards.t.ThaliaHereticCathar.class));
        cards.add(new SetCardInfo("Thermo-Alchemist", 180, Rarity.UNCOMMON, mage.cards.t.ThermoAlchemist.class));
        cards.add(new SetCardInfo("Thing in the Ice", 95, Rarity.RARE, mage.cards.t.ThingInTheIce.class));
        cards.add(new SetCardInfo("Thornhide Wolves", 218, Rarity.COMMON, mage.cards.t.ThornhideWolves.class));
        cards.add(new SetCardInfo("Thraben Foulbloods", 135, Rarity.COMMON, mage.cards.t.ThrabenFoulbloods.class));
        cards.add(new SetCardInfo("Thraben Inspector", 51, Rarity.COMMON, mage.cards.t.ThrabenInspector.class));
        cards.add(new SetCardInfo("Timber Shredder", 201, Rarity.COMMON, mage.cards.t.TimberShredder.class));
        cards.add(new SetCardInfo("Tireless Tracker", 219, Rarity.RARE, mage.cards.t.TirelessTracker.class));
        cards.add(new SetCardInfo("Topplegeist", 52, Rarity.UNCOMMON, mage.cards.t.Topplegeist.class));
        cards.add(new SetCardInfo("Tormenting Voice", 181, Rarity.COMMON, mage.cards.t.TormentingVoice.class));
        cards.add(new SetCardInfo("Town Gossipmonger", 53, Rarity.UNCOMMON, mage.cards.t.TownGossipmonger.class));
        cards.add(new SetCardInfo("Traverse the Ulvenwald", 220, Rarity.RARE, mage.cards.t.TraverseTheUlvenwald.class));
        cards.add(new SetCardInfo("Tree of Perdition", 136, Rarity.RARE, mage.cards.t.TreeOfPerdition.class));
        cards.add(new SetCardInfo("Triskaidekaphobia", 137, Rarity.RARE, mage.cards.t.Triskaidekaphobia.class));
        cards.add(new SetCardInfo("True-Faith Censer", 262, Rarity.COMMON, mage.cards.t.TrueFaithCenser.class));
        cards.add(new SetCardInfo("Ulrich of the Krallenhorde", 246, Rarity.RARE, mage.cards.u.UlrichOfTheKrallenhorde.class));
        cards.add(new SetCardInfo("Ulrich's Kindred", 182, Rarity.UNCOMMON, mage.cards.u.UlrichsKindred.class));
        cards.add(new SetCardInfo("Ulrich, Uncontested Alpha", 246, Rarity.RARE, mage.cards.u.UlrichUncontestedAlpha.class));
        cards.add(new SetCardInfo("Ulvenwald Abomination", 221, Rarity.COMMON, mage.cards.u.UlvenwaldAbomination.class));
        cards.add(new SetCardInfo("Ulvenwald Captive", 221, Rarity.COMMON, mage.cards.u.UlvenwaldCaptive.class));
        cards.add(new SetCardInfo("Ulvenwald Hydra", 222, Rarity.RARE, mage.cards.u.UlvenwaldHydra.class));
        cards.add(new SetCardInfo("Ulvenwald Mysteries", 223, Rarity.UNCOMMON, mage.cards.u.UlvenwaldMysteries.class));
        cards.add(new SetCardInfo("Uncaged Fury", 183, Rarity.UNCOMMON, mage.cards.u.UncagedFury.class));
        cards.add(new SetCardInfo("Vessel of Nascency", 224, Rarity.UNCOMMON, mage.cards.v.VesselOfNascency.class));
        cards.add(new SetCardInfo("Veteran Cathar", 225, Rarity.UNCOMMON, mage.cards.v.VeteranCathar.class));
        cards.add(new SetCardInfo("Vildin-Pack Alpha", 159, Rarity.UNCOMMON, mage.cards.v.VildinPackAlpha.class));
        cards.add(new SetCardInfo("Village Messenger", 184, Rarity.UNCOMMON, mage.cards.v.VillageMessenger.class));
        cards.add(new SetCardInfo("Voldaren Pariah", 138, Rarity.RARE, mage.cards.v.VoldarenPariah.class));
        cards.add(new SetCardInfo("Voracious Reader", 58, Rarity.UNCOMMON, mage.cards.v.VoraciousReader.class));
        cards.add(new SetCardInfo("Weirded Vampire", 139, Rarity.COMMON, mage.cards.w.WeirdedVampire.class));
        cards.add(new SetCardInfo("Weirding Wood", 226, Rarity.COMMON, mage.cards.w.WeirdingWood.class));
        cards.add(new SetCardInfo("Werewolf of Ancient Hunger", 211, Rarity.RARE, mage.cards.w.WerewolfOfAncientHunger.class));
        cards.add(new SetCardInfo("Westvale Abbey", 275, Rarity.RARE, mage.cards.w.WestvaleAbbey.class));
        cards.add(new SetCardInfo("Wharf Infiltrator", 96, Rarity.RARE, mage.cards.w.WharfInfiltrator.class));
        cards.add(new SetCardInfo("Wild-Field Scarecrow", 263, Rarity.COMMON, mage.cards.w.WildFieldScarecrow.class));
        cards.add(new SetCardInfo("Wolfkin Bond", 227, Rarity.COMMON, mage.cards.w.WolfkinBond.class));
        cards.add(new SetCardInfo("Woodland Stream", 276, Rarity.UNCOMMON, mage.cards.w.WoodlandStream.class));
        cards.add(new SetCardInfo("Wretched Gryff", 9, Rarity.COMMON, mage.cards.w.WretchedGryff.class));
    }
}