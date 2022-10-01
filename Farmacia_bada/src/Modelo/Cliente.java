/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class Cliente extends Tipo_cliente {

    private int cli_id;
    private int cli_per_id;
    private int Cli_tipo_id;

    public Cliente() {
    }

    public Cliente(int cli_id, int cli_per_id, int Cli_tipo_id) {
        this.cli_id = cli_id;
        this.cli_per_id = cli_per_id;
        this.Cli_tipo_id = Cli_tipo_id;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public int getCli_per_id() {
        return cli_per_id;
    }

    public void setCli_per_id(int cli_per_id) {
        this.cli_per_id = cli_per_id;
    }

    public int getCli_tipo_id() {
        return Cli_tipo_id;
    }

    public void setCli_tipo_id(int Cli_tipo_id) {
        this.Cli_tipo_id = Cli_tipo_id;
    }


}
